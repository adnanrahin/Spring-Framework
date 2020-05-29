package com.spring.core.containers.ioc.beanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BoxingCoach implements Coach {

    @Autowired
    @Qualifier("restFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkOut() {
        return "Boxing is Very popular in United States.";
    }

    @Override
    public String getCoachFortune() {
        return fortuneService.getFortune();
    }
}
