package com.designPatterns.testOneCreationalPatterns.test1OrOneSingleton;

public class SingletonOneApplication {
    public static void main(String[] args) {
        SingletonOneCaptain singletonOneCaptainOne = SingletonOneCaptain.methodGetInstance();
        SingletonOneCaptain singletonOneCaptainTwo = SingletonOneCaptain.methodGetInstance();
    }
}
