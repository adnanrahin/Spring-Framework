package com.spring.core.containers.ioc.javaClassConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.core.containers.ioc.javaClassConfiguration")
public class ConfigurationClass {

    @Bean
    public FortuneService regularFortuneService() {
        return new RegularFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(regularFortuneService());
    }

}
