package com.spring.core.containers.ioc.xmlconfig;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String cricketTeamName;
    private String cricketEmail;

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public String getCricketTeamName() {
        return cricketTeamName;
    }

    public void setCricketTeamName(String cricketTeamName) {
        this.cricketTeamName = cricketTeamName;
    }

    public String getCricketEmail() {
        return cricketEmail;
    }

    public void setCricketEmail(String cricketEmail) {
        this.cricketEmail = cricketEmail;
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
