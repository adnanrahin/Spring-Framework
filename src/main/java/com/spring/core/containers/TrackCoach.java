package com.spring.core.containers;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "20 minutes Running Everyday";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
