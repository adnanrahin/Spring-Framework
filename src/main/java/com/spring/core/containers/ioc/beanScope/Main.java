package com.spring.core.containers.ioc.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[]) {

        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("beanScope.xml");


        Coach boxingCoach = context.getBean("boxingCoach", BoxingCoach.class);

        System.out.println(boxingCoach.getDailyWorkOut());

        System.out.println(boxingCoach.getCoachFortune());


        Coach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);

        System.out.println(tennisCoach.getCoachFortune());
        System.out.println(tennisCoach.getDailyWorkOut());

    }

}
