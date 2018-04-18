package com.example.aopDemo.config;

import java.lang.annotation.*;
/**
*创建一个自定义的注解
*Creating a custom annotation
*/
@Target({ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ExecutorInfo {
}
