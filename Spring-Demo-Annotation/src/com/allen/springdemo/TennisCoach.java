package com.allen.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {


    private FortuneService fortuneService;

    // default constructor
    public TennisCoach(){

    }

    /*// automatically find component with matching types
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    @Autowired
    public void setFortuneService(FortuneService thefortuneService) {
        System.out.println("TennisCoach: Setter injection");
        this.fortuneService = thefortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
