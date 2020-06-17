package com.allen.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private String[] data = {"Beware of the wolves.",
                             "Dilligience is the mother of success.",
                            "The journey is the rewward."};
    // create a RNG
    private Random random = new Random();

    @Override
    public String getFortune() {
        // pick a random string
        int index = random.nextInt(data.length);
        return data[index];
    }
}
