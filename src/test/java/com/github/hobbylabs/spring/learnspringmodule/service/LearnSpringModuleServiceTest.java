package com.github.hobbylabs.spring.learnspringmodule.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class LearnSpringModuleServiceTest {

    @Autowired
    private LearnSpringModuleService learnSpringModuleService;

    @Test
    public void contextLoads() {
        assertThat(learnSpringModuleService.message()).isNotNull();
    }
}