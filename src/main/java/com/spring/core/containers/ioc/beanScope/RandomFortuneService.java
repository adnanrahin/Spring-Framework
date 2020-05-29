package com.spring.core.containers.ioc.beanScope;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Random Fortune Service Class.";
    }
}
