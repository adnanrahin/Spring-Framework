package com.spring.core.containers.ioc.annotations;

import org.springframework.stereotype.Component;

@Component // Spring will provide default bean id, which is class name
public class SoccerCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Soccer Coach is Focus on Free Kick. ";
    }
}
