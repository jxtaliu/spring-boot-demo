package com.example.springbootdemo.application.arguments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.application.arguments
 * @Description: TODO
 * @date Date : 2019年09月25日 09:03
 */
@Component
public class MyBeanAboutArguments {
    @Autowired
    public MyBeanAboutArguments(ApplicationArguments args){
        boolean debug = args.containsOption("debug");
        List<String> files = args.getNonOptionArgs();
    }
}
