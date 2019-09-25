package com.example.springbootdemo.configuration.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * acme:
 *   list:
 *     - name: my name
 *       description: my description
 *
 * acme:
 *   list:
 *     - name: my name
 *       description: my description
 *     - name: another name
 *       description: another description
 *
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.configuration.bean
 * @Description: TODO
 * @date Date : 2019年09月25日 11:46
 */
@ConfigurationProperties(prefix = "acme")
public class AcmeListProperties {
    private final List<MyPojo> list = new ArrayList<>();

    public List<MyPojo> getList() {
        return this.list;
    }
}
