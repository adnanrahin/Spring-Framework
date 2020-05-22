package com.spring.core.containers.ioc.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getNewFortune() {
        return "Today is your lucky day.";
    }
}
