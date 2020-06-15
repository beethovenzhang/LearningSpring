package com.allen.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get bean from container
        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

        // call method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the container
        context.close();
    }
}