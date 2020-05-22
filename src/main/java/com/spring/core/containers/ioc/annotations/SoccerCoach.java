package com.spring.core.containers.ioc.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Spring will provide default bean id, which is class name
public class SoccerCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Soccer Coach is Focus on Free Kick. ";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getNewFortune();
    }
}
