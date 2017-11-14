package com.thinkin.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {
    final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Before("execution(* com.thinkin..*())")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("calling " + joinPoint.getSignature().getName());
    }


}
