package com.example.aopDemo.service;

import com.example.aopDemo.task.AsyncTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.IntStream;

/**
 *实现CommandLineRunner的服务，spring boot启动后执行此类
 */
@Slf4j
@Service
public class EntryService implements CommandLineRunner {
    private AsyncTask asyncTask;

    @Autowired
    public EntryService(AsyncTask asyncTask) {
        this.asyncTask = asyncTask;

    }

    @Override
    public void run(String... strings) {
        //使用初始化的线程池，开启了30个任务，使用一个阻塞队列接收任务的返回结果
        //using the initialized spring thread pool,generating 30 tasks,using a blocking queue to collect results
        BlockingQueue<Future<String>> queue = IntStream.rangeClosed(1, 30)
                .mapToObj(i -> asyncTask.execAddData()).collect(Collectors.toCollection(LinkedBlockingQueue::new));


        IntStream.rangeClosed(1,30).forEach(i->
        {
            try {
                queue.take().get();//阻塞接收每个任务的返回结果;block to get result for every task
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });

    }

}
