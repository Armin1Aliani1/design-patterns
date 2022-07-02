package com.designPatterns.testOneCreationalPatterns.test3OrThreeFactoryMethod;

public class FactoryMethodOneRose {
    public Rose createRose(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("red") ||
                color.equalsIgnoreCase("pink") ||
                color.equalsIgnoreCase("yellow")) {
            if (color.equalsIgnoreCase("red")) {
                System.out.println("I am red rose");
                return new RedRose();
            } else if (color.equalsIgnoreCase("pink")) {
                System.out.println("I am pink rose");
                return new PinkRose();
            } else if (color.equalsIgnoreCase("yellow")) {
                System.out.println("I am yellow rose");
                return new YellowRose();
            }
        } else {
            System.out.println("The requested flower color does not exist");
        }
        return null;
    }
}
