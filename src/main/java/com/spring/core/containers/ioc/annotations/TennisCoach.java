package com.spring.core.containers.ioc.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired // Field Injection use Java Reflection
    private FortuneService fortuneService;

    /*@Autowired
    public void setFortuneService(FortuneService fortuneService) { // setter injection
        this.fortuneService = fortuneService;
    }*/

    /*@Autowired
    public TennisCoach(FortuneService fortuneService) { // constructor injection
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkOut() {
        return "Tennis Coach: Practice your Backhand Smash. ";
    }

    public String getDailyFortune() {
        return fortuneService.getNewFortune();
    }
}
