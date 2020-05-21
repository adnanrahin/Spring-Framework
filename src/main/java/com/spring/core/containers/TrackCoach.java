package com.spring.core.containers;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "20 minutes Running Everyday";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
