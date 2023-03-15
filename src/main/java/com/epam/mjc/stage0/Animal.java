package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String fur, puw;
        if (hasFur) {
            fur = "a";
        } else {
            fur = "no";
        }
        if (numberOfPaws == 1) {
            puw = "puw";
        } else {
            puw = "puws";
        }

        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + puw + " and " + fur + " fur.";
    }
}
