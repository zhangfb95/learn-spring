package com.learn.spring.guess;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhangfb
 */
public class Game {

    private SpecialNumbers specialNumbers;
    private AtomicInteger index = new AtomicInteger(0);

    public Game(SpecialNumbers specialNumbers) {
        this.specialNumbers = specialNumbers;
    }

    public String call(int input) {
        return OutputEnum.FIZZ.getName();
    }
}
