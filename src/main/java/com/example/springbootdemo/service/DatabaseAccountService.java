package com.example.springbootdemo.service;

import com.example.springbootdemo.common.RiskAssessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.service
 * @Description: TODO
 * @date Date : 2019年08月16日 22:38
 */

@Service
public class DatabaseAccountService implements AccountService{

    private final RiskAssessor riskAssessor;

    @Autowired
    public DatabaseAccountService(RiskAssessor riskAssessor){
        this.riskAssessor = riskAssessor;
    }

    @Override
    public void sayHello() {
        riskAssessor.risk();
        System.out.println("--------sayHello-------");
    }
}
