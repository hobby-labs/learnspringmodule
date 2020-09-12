package com.github.hobbylabs.spring.learnspringmodule.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("com.github.hobbylabs.spring.learnspringmodule")
public class LearnSpringModuleServiceProperties {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
