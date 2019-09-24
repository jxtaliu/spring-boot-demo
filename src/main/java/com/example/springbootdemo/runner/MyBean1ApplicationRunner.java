package com.example.springbootdemo.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.runner
 * @Description: TODO
 * @date Date : 2019年08月18日 08:25
 */
@Component
@Order(2)
public class MyBean1ApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(MyBean1ApplicationRunner.class.getCanonicalName()+"------------");
    }
}
