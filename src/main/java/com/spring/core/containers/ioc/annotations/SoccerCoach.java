package com.spring.core.containers.ioc.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component // Spring will provide default bean id, which is class name
public class SoccerCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @PostConstruct
    public void startupMethod() {
        System.out.println("Soccer Coach is Started.");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("Soccer Coach is Destroyed.");

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
