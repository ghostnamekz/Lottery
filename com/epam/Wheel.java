package com.epam;

import java.util.*;

public class Wheel {
    private Set<Integer> wheelNumbers = new LinkedHashSet<Integer>();
    private ArrayList<Integer> newWheelNumbers = new ArrayList<Integer>();
    private static final int maxCount = 90;
    public void numbersOfWheel() {
        for (int i = 0; i < maxCount; i++ ) {
            newWheelNumbers.add(i);
        }
        Collections.shuffle(newWheelNumbers);
    }

    public ArrayList<Integer> getNewWheelNumbers() {
        return newWheelNumbers;
    }

    @Override
    public String toString() {
        return "com.epam.Wheel{" +
                "wheelNumbers=" + wheelNumbers +
                '}';
    }
}