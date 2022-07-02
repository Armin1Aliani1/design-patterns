package com.designPatterns.testOneCreationalPatterns.test1OrOneSingleton;

public final class SingletonOneCaptain {
    private static SingletonOneCaptain singletonOneCaptain;

    private SingletonOneCaptain() {
    }

    public static synchronized SingletonOneCaptain methodGetInstance() {
        if (singletonOneCaptain == null) {
            singletonOneCaptain = new SingletonOneCaptain();
            System.out.println("New singletonOneCaptain selected");
        } else {
            System.out.println("You've already elected a captain");
        }
        return singletonOneCaptain;
    }
}
