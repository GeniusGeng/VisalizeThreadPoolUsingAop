package com.example.aopDemo.task;

import com.example.aopDemo.config.ExecutorInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Future;

/**
 *模拟一个任务
 */
@Component
@Slf4j
public class AsyncTask {

    @Async("asyncServiceExecutor")
    @ExecutorInfo
    public Future<String> execAddData(){

        try {
            //process data.. save data to database
            //....
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new AsyncResult<>("success");
    }
}
