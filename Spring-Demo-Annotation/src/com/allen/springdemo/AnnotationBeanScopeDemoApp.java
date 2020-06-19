package com.allen.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = theCoach == alphaCoach;

        System.out.println(result);

        System.out.println(theCoach);
        System.out.println(alphaCoach);

        context.close();
    }
}
