package com.example.springbootdemo.configuration.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * acme.my-project.person.first-name：Kebab case, which is recommended for use in .properties and .yml files.
 *
 * acme.myProject.person.firstName：Standard camel case syntax.
 *
 * acme.my_project.person.first_name：Underscore notation, which is an alternative format for use in .properties and .yml files.
 *
 * ACME_MYPROJECT_PERSON_FIRSTNAME；Upper case format, which is recommended when using system environment variables.
 *
 *
 * The prefix value for the annotation must be in kebab case
 * (lowercase and separated by -, such as acme.my-project.person).
 *
 *
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.configuration.bean
 * @Description: TODO
 * @date Date : 2019年09月25日 11:31
 */
@ConfigurationProperties(prefix="acme.my-project.person")
public class RelaxedBindingOwnerProperties {
    private String firstName;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

