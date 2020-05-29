package com.spring.core.containers.ioc.javaClassConfiguration;

import org.springframework.stereotype.Component;

@Component("restFortune")
public class RestFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Rest Fortune Service Class.";
    }
}
