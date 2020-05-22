package com.spring.core.containers.ioc.xmlconfig;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "BaseCoach Work Out: 30 minutes in Batting Cage";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
