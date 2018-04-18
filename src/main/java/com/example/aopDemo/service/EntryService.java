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

        BlockingQueue<Future<String>> queue = new LinkedBlockingQueue<>();

        IntStream.rangeClosed(1,30).forEach(i->
        {
            Future<String> future = asyncTask.execAddData();
            queue.add(future);

        });


        IntStream.rangeClosed(1,30).forEach(i->
        {
            try {
                queue.take().get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });

    }

}
