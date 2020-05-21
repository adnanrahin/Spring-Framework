package com.spring.core.containers;

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

    }

}
