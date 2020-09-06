package com.github.hobbylabs.learnspringmodule;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(LearnSpringModuleConfiguration.class)
@Configuration
public @interface EnableLearnSpringModule {
}
