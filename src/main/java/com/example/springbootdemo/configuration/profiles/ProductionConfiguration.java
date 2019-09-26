package com.example.springbootdemo.configuration.profiles;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Spring Profiles provide a way to segregate parts of your application configuration
 * and make it be available only in certain environments.
 * Any @Component or @Configuration can be marked with @Profile to limit when it is loaded,
 * as shown in the following example:
 *
 * You can use a spring.profiles.active Environment property to specify which profiles are active.
 * You can specify the property in any of the ways described earlier in this chapter.
 * For example, you could include it in your application.properties, as shown in the following example:
 * spring.profiles.active=dev,hsqldb
 * You could also specify it on the command line
 * by using the following switch: --spring.profiles.active=dev,hsqldb.
 *
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.configuration.profiles
 * @Description: TODO
 * @date Date : 2019年09月25日 23:05
 */
@Configuration
@Profile("production")
public class ProductionConfiguration {
}
