package com.spring.core.containers.ioc.QualifierAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public CricketCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Cricket Require Lots of Practice. ";
    }

    public String getCricketFortune() {
        return fortuneService.getFortune();
    }

}
