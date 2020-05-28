package com.spring.core.containers.ioc.QualifierAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[]) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("testContext.xml");

        Coach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);

        System.out.println(cricketCoach.getDailyWorkOut());

        System.out.println(cricketCoach.getCricketFortune());

        context.close();

    }

}
