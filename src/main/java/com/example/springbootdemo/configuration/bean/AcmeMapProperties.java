package com.example.springbootdemo.configuration.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * acme:
 *   map:
 *     key1:
 *       name: my name 1
 *       description: my description 1
 *
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.configuration.bean
 * @Description: TODO
 * @date Date : 2019年09月25日 11:49
 */
@ConfigurationProperties(prefix = "ace")
public class AcmeMapProperties {
    private final Map<String, MyPojo> map = new HashMap<>();

    public Map<String, MyPojo> getMap() {
        return this.map;
    }
}
