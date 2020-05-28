package com.spring.core.containers.ioc.QualifierAnnotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "This is Happy Fortune Service. ";
    }
}
