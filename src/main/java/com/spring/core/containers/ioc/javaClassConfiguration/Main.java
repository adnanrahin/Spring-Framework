package com.spring.core.containers.ioc.javaClassConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String args[]) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);

        Coach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);

        System.out.println(tennisCoach.getDailyWorkOut());

        System.out.println(tennisCoach.getFortune());

        context.close();

    }

}
