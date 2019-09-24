package com.example.springbootdemo.wired.autowired;

import org.springframework.stereotype.Service;

/**
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.wired.autowired
 * @Description: TODO
 * @date Date : 2019年08月17日 20:12
 */
@Service
public class Doctor implements Person {
    @Override
    public String personName() {
        return Doctor.class.getCanonicalName();
    }
}
