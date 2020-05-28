package com.spring.core.containers.ioc.QualifierAnnotations;

public class BoxingCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Boxing Require Lots of Power. ";
    }

    @Override
    public String getCricketFortune() {
        return null;
    }
}
