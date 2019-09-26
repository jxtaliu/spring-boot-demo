package com.example.springbootdemo.configuration.validation;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.net.InetAddress;

/**
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.springbootdemo.configuration.validation
 * @Description: TODO
 * @date Date : 2019年09月25日 14:27
 */
@ConfigurationProperties(prefix="acme")
@Validated
public class AcmeValidationProperties {
    @NotNull
    private InetAddress remoteAddress;

    public InetAddress getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(InetAddress remoteAddress) {
        this.remoteAddress = remoteAddress;
    }



    public Security getSecurity() {
        return security;
    }

    @Valid
    private final Security security = new Security();

    // ... getters and setters

    public static class Security {

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        @NotEmpty
        public String username;

        // ... getters and setters

    }
}
