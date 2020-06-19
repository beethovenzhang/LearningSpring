package com.allen.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // default constructor
    public TennisCoach(){
        System.out.println("Default constructor");
    }

    // define init method
    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println("Do my start up stuff");
    }

    // define destroy method
    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println("Do my clean up stuff");
    }

    /*// automatically find component with matching types
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

/*    @Autowired
    public void setFortuneService(FortuneService thefortuneService) {
        System.out.println("TennisCoach: Setter injection");
        this.fortuneService = thefortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
