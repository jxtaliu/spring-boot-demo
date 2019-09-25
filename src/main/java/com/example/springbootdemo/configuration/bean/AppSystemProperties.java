package com.example.springbootdemo.configuration.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * Spring Boot has dedicated support for expressing durations.
 * If you expose a java.time.Duration property,
 * the following formats in application properties are available:
 *
 * A regular long representation (using milliseconds as the default
 * unit unless a @DurationUnit has been specified)
 * The standard ISO-8601 format used by java.time.Duration
 * A more readable format where the value and the unit are coupled (e.g. 10s means 10 seconds)
 *
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.configuration.bean
 * @Description: TODO
 * @date Date : 2019年09月25日 14:30
 */
@ConfigurationProperties("app.system")
public class AppSystemProperties {
    @DurationUnit(ChronoUnit.SECONDS)
    private Duration sessionTimeout = Duration.ofSeconds(30);

    private Duration readTimeout = Duration.ofMillis(1000);

    public Duration getSessionTimeout() {
        return this.sessionTimeout;
    }

    public void setSessionTimeout(Duration sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public Duration getReadTimeout() {
        return this.readTimeout;
    }

    public void setReadTimeout(Duration readTimeout) {
        this.readTimeout = readTimeout;
    }
}
