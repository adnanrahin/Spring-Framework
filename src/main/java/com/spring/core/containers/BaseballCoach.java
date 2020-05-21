package com.spring.core.containers;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "BaseCoach Work Out: 30 minutes in Batting Cage";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
