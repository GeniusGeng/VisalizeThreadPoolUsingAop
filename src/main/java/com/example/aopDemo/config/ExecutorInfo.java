package com.example.aopDemo.config;

import java.lang.annotation.*;

@Target({ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ExecutorInfo {
}
