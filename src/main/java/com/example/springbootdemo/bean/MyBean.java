package com.example.springbootdemo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.bean
 * @Description: TODO
 * @date Date : 2019年08月19日 21:09
 */
@Component
public class MyBean {
    @Value("${bruce.name}")
    private String name;

    @Value("${my.secret}")
    private String secret;

    @Value("${my.number}")
    private int number;

    @Value("${my.bignumber}")
    private long longValue;

    public String getName(){
        return this.name;
    }

    public String getSecret(){
        return this.secret;
    }

    public int getNumber(){
        return this.number;
    }

    public long getLongValue(){
        return this.longValue;
    }
}
