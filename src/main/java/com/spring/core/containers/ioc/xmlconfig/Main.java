package com.spring.core.containers.ioc.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[]) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BaseballCoach theCoach = context.getBean("baseballCoach", BaseballCoach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());


        TrackCoach trackCoach = context.getBean("trackCoach", TrackCoach.class);

        System.out.println(trackCoach.getDailyWorkout());

        System.out.println(trackCoach.getDailyFortune());



        CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);

        System.out.println(cricketCoach.getDailyWorkout());

        System.out.println(cricketCoach.getCricketTeamName());

        System.out.println(cricketCoach.getCricketEmail());

        context.close();

    }

}
