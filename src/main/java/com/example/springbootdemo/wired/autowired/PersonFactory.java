package com.example.springbootdemo.wired.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.wired.autowired
 * @Description: TODO
 * @date Date : 2019年08月17日 20:15
 */

@Service
public class PersonFactory {
    @Autowired
    @Qualifier("police")
    private Person person;
    public String toString(){
        return person.personName();
    }
}
