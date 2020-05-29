package com.spring.core.containers.ioc.javaClassConfiguration;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "This is for Swim Coach.";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
