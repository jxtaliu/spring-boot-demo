package com.example.springbootdemo.controller;

import com.example.springbootdemo.configuration.bean.Config;
import com.example.springbootdemo.configuration.bean.MyBean;
import com.example.springbootdemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {

    @Autowired
    private AccountService accountService;

    @Autowired
    private Config config;

    @Autowired
    private MyBean myBean;

    @RequestMapping("/")
    String home() {
        accountService.sayHello();
        System.out.println("---------- MyBean.getName()=" + myBean.getName() + "----------");
        System.out.println("---------- MyBean.getName()=" + myBean.getSecret() + "----------");
        System.out.println("---------- MyBean.getName()=" + myBean.getNumber() + "----------");
        System.out.println("---------- MyBean.getName()=" + myBean.getLongValue() + "----------");
        System.out.println("ConfigurationProperties test:" + config.getServers().toString());
        return "Hello World!yes";
    }

    @RequestMapping("/hello")
    String home1() {
        return "Hello World!123";
    }

//    public static void main(String[] args) {
//        SpringApplication.run(Example.class, args);
//    }

}