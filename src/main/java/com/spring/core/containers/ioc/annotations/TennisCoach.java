package com.spring.core.containers.ioc.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Tennis Coach: Practice your Backhand Smash. ";
    }

    public String getDailyFortune() {
        return fortuneService.getNewFortune();
    }
}
