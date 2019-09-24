package com.example.springbootdemo.common;

import org.springframework.stereotype.Component;

/**
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.common
 * @Description: Test Demo Class
 * @date Date : 2019年08月16日 22:37
 */

@Component
public class RiskAssessor {
    public void risk(){
        System.out.println("-------This is RiskAssessor risk()--------");
    }
}
