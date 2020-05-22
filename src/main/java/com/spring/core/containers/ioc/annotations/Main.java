package com.spring.core.containers.ioc.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[]) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextForAnnotations.xml");

        Coach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);

        System.out.println(tennisCoach.getDailyWorkOut());

        Coach soccerCoach = context.getBean("soccerCoach", SoccerCoach.class);

        System.out.println(soccerCoach.getDailyWorkOut());

        context.close();

    }

}
