package com.spring.core.containers.ioc.annotations;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Tennis Coach: Practice your Backhand Smash. ";
    }
}
