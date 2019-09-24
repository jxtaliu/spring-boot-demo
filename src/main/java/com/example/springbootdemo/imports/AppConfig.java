package com.example.springbootdemo.imports;

import com.example.springbootdemo.imports.bean.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.imports
 * @Description: TODO
 * @date Date : 2019年08月17日 19:22
 */
@Import({TestBean1.class, TestBean5.class, TestBean6.class, TestConfig.class, TestImportSelector.class, TestImportBeanDefinitionRegistrar.class})
@Configuration
public class AppConfig {
}
