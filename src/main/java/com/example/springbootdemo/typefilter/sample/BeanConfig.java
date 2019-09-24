package com.example.springbootdemo.typefilter.sample;

import com.example.springbootdemo.typefilter.CustomTypeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.typefilter.sample
 * @Description: TODO
 * @date Date : 2019年08月17日 08:14
 */

//@ComponentScan(value = "io.xx",
//		excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})},
//		useDefaultFilters = false)

@ComponentScan(value = "com.example",
        includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, value = {CustomTypeFilter.class})},
//        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})},
        useDefaultFilters = false)
@Configuration
public class BeanConfig {
}
