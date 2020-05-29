package com.spring.core.containers.ioc.javaClassConfiguration;

public class RegularFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Regular Fortune Service.";
    }
}
