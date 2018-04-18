package com.example.aopDemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * initialize Spring Thread Pool
 * @author by gengrc
 * @since 2018/3/22
 */
@Configuration
@EnableAsync
@Slf4j
public class ProjectExecutor {
    @Bean(name = "asyncServiceExecutor")
    public ThreadPoolTaskExecutor asyncServiceExecutor() {

        ThreadPoolTaskExecutor executor =  new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(8);
        executor.setMaxPoolSize(8);
        executor.setQueueCapacity(Integer.MAX_VALUE);
        executor.setThreadNamePrefix("threadPool-asyc-");
        executor.setKeepAliveSeconds(0);
        // rejection-policy
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());

        executor.initialize();
        return executor;
    }
}
