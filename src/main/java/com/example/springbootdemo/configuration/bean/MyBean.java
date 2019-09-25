package com.example.springbootdemo.configuration.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Devtools global settings properties on your home directory (~/.spring-boot-devtools.properties when devtools is active).
 * @TestPropertySource annotations on your tests.
 * properties attribute on your tests. Available on @SpringBootTest and the test annotations for testing a particular slice of your application.
 * Command line arguments.
 * Properties from SPRING_APPLICATION_JSON (inline JSON embedded in an environment variable or system property).
 * ServletConfig init parameters.
 * ServletContext init parameters.
 * JNDI attributes from java:comp/env.
 * Java System properties (System.getProperties()).
 * OS environment variables.
 * A RandomValuePropertySource that has properties only in random.*.
 * Profile-specific application properties outside of your packaged jar (application-{profile}.properties and YAML variants).
 * Profile-specific application properties packaged inside your jar (application-{profile}.properties and YAML variants).
 * Application properties outside of your packaged jar (application.properties and YAML variants).
 * Application properties packaged inside your jar (application.properties and YAML variants).
 * @PropertySource annotations on your @Configuration classes.
 * Default properties (specified by setting SpringApplication.setDefaultProperties).
 *
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


    /**
     * As well as using @ConfigurationProperties to annotate a class,
     * you can also use it on public @Bean methods.
     * Doing so can be particularly useful when you want to bind properties to third-party components
     * that are outside of your control.
     *
     * To configure a bean from the Environment properties,
     * add @ConfigurationProperties to its bean registration,
     * as shown in the following example:
     *
     * @return
     */
    @ConfigurationProperties(prefix = "another")
    @Bean
    public AnotherComponent anotherComponent(){
        return null;
    }
}
