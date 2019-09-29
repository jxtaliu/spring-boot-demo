package com.example.springbootdemo.controller.messageconverter;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.controller.messageconverter
 * @Description: TODO
 * @date Date : 2019年09月28日 08:17
 */
@Configuration
public class My1Configuration {
//    @Bean
    public HttpMessageConverters customConverters() {
        HttpMessageConverter<?> additional = null;
        HttpMessageConverter<?> another = null;
        return new HttpMessageConverters(additional, another);
    }

    /**
     * Cross-origin resource sharing (CORS) is a W3C specification implemented by most browsers
     * that lets you specify in a flexible way what kind of cross-domain requests are authorized,
     * instead of using some less secure and less powerful approaches such as IFRAME or JSONP.
     *
     * As of version 4.2, Spring MVC supports CORS. Using controller method CORS configuration with
     * @CrossOrigin annotations in your Spring Boot application does not require any specific configuration.
     * Global CORS configuration can be defined by registering a WebMvcConfigurer bean with
     * a customized addCorsMappings(CorsRegistry) method, as shown in the following example:
     *
     * @return
     */
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**");
            }
        };
    }
}
