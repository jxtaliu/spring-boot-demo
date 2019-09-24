package com.example.springbootdemo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.runner
 * @Description: TODO
 * @date Date : 2019年08月18日 08:11
 */
@Component
public class MyBean1CommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println(MyBean1CommandLineRunner.class.getCanonicalName()+"------------");
    }
}