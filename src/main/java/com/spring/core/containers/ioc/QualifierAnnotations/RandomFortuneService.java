package com.spring.core.containers.ioc.QualifierAnnotations;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "This is a Random Fortune Service.";
    }
}
