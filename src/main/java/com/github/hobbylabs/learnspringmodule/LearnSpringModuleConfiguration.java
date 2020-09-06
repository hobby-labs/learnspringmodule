package com.github.hobbylabs.learnspringmodule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan(basePackages = "com.github.hobbylabs.learnspringmodule")
public class LearnSpringModuleConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(LearnSpringModuleConfiguration.class);

    @PostConstruct
    public void postConstruct() {
        logger.info("================================================================");
        logger.info("LearnSpringModule has Loaded!!");
        logger.info("================================================================");
    }
}
