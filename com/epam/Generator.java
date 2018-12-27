package com.epam;

public class Generator {
    public static int numberGenerator() {
        int randomNumber = (int) (Math.random()*90);
        return randomNumber;
    }
}