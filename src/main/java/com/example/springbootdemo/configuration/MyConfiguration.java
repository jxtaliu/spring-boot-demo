package com.example.springbootdemo.configuration;

import com.example.springbootdemo.configuration.bean.*;
import com.example.springbootdemo.configuration.validation.AcmeValidationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * When the @ConfigurationProperties bean is registered that way,
 * the bean has a conventional name: <prefix>-<fqn>,
 * where <prefix> is the environment key prefix specified in the @ConfigurationProperties annotation
 * and <fqn> is the fully qualified name of the bean.
 * If the annotation does not provide any prefix,
 * only the fully qualified name of the bean is used.
 *
 * The bean name in the example above is acme-com.example.AcmeListProperties.
 *
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.configuration.bean
 * @Description: TODO
 * @date Date : 2019年09月25日 11:08
 */
@Configuration
@EnableConfigurationProperties({Config.class, RelaxedBindingOwnerProperties.class,
        AcmeListProperties.class, AcmeMapProperties.class, AcmeValidationProperties.class,
        AppSystemProperties.class,AppIoProperties.class})
public class MyConfiguration {
}
