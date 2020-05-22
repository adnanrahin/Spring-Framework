package com.spring.core.containers.ioc.xmlconfig;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today your Lucky Day";
    }
}
