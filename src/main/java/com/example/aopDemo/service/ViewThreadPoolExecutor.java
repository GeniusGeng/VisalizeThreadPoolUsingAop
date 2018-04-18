package com.example.aopDemo.service;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Creating aspect
 * 创建AOP切面
 */
@Aspect
@Component("viewThreadPoolExecutor")
@Slf4j
public class ViewThreadPoolExecutor {

    private ThreadPoolExecutor executor;
    @Autowired
    private ViewThreadPoolExecutor(@Qualifier("asyncServiceExecutor") ThreadPoolTaskExecutor executor){

        this.executor = executor.getThreadPoolExecutor();
    }


    private void showThreadPoolInfo()
    {
        log.info("taskCount [{}], completedTaskCount [{}], activeCount [{}], queueSize [{}]",
                executor.getTaskCount(),
                executor.getCompletedTaskCount(),
                executor.getActiveCount(),
                executor.getQueue().size());

    }



    @Around("@annotation(com.example.aopDemo.config.ExecutorInfo)")
    public Object executeAround(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        try {
            String className = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            showThreadPoolInfo();
            
            Object result = joinPoint.proceed();
            
            long end = System.currentTimeMillis() - start;
            log.debug("Method " + className + "." + methodName + " ()" + " execution time : "
                    + end + " ms");

            return result;
        } catch (IllegalArgumentException e) {
            log.error("Illegal argument " + Arrays.toString(joinPoint.getArgs()) + " in "
                    + joinPoint.getSignature().getName() + "()");
            throw e;
        }
    }

}
