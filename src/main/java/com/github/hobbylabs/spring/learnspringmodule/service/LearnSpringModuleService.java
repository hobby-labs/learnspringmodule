package com.github.hobbylabs.spring.learnspringmodule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(LearnSpringModuleServiceProperties.class)
public class LearnSpringModuleService {
    private final LearnSpringModuleServiceProperties learnSpringModuleServiceProperties;

    public LearnSpringModuleService(LearnSpringModuleServiceProperties learnSpringModuleServiceProperties) {
        this.learnSpringModuleServiceProperties = learnSpringModuleServiceProperties;
    }
    public String message() {
        return this.learnSpringModuleServiceProperties.getMessage();
    }
    public String getHelloWorld() {
        return "Hello World2.";
    }
}