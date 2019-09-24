package com.example.springbootdemo.imports.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.imports.bean
 * @Description: TODO
 * @date Date : 2019年08月17日 19:24
 */
@Configuration
public class TestConfig {
    @Bean
    public TestBean2 getTestBean2(){
        return new TestBean2();
    }
}
