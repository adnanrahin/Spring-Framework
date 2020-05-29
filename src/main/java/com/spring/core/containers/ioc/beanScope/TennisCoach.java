package com.spring.core.containers.ioc.beanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // by default Bean Scope is Singleton.
public class TennisCoach implements Coach {

    private FortuneService fortuneService;


    @Autowired
    public TennisCoach(@Qualifier("random") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Tennis Coach";
    }

    @Override
    public String getCoachFortune() {
        return fortuneService.getFortune();
    }
}
