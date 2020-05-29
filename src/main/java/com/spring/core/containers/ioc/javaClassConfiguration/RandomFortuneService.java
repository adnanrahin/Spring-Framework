package com.spring.core.containers.ioc.javaClassConfiguration;

import org.springframework.stereotype.Component;

@Component("randFortune")
public class RandomFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Random Fortune Service.";
    }
}
