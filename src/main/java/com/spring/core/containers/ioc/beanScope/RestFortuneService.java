package com.spring.core.containers.ioc.beanScope;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "This is Rest Fortune Service Class.";
    }
}
