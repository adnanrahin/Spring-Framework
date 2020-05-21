package com.spring.core.containers;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket Require Lot's of Stamina.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
