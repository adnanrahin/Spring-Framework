package com.spring.core.containers.ioc.javaClassConfiguration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(@Qualifier("randFortune") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Tennis Coach Created.";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
