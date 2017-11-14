package com.thinkin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppCofig {

    @Bean
    public LoggingAspect ourLoggingAspect() {
        return new LoggingAspect();
    }
}
