package com.designPatterns.testOneCreationalPatterns.test3OrThreeFactoryMethod;

public class FactoryMethodOneApplication {
    public static void main(String[] args) {
        FactoryMethodOneRose factoryMethodOneRose = new FactoryMethodOneRose();
        Rose pinkRose = factoryMethodOneRose.createRose("pink");
        pinkRose.addColor();
        Rose yellowRose = factoryMethodOneRose.createRose("yellow");
        yellowRose.addColor();
        Rose redRose = factoryMethodOneRose.createRose("red");
        redRose.addColor();

        System.out.println();
        Rose blueRose = factoryMethodOneRose.createRose("blue");
//        blueRose.addColor();

    }
}
