package com.learn.spring.guess;

/**
 * @author zhangfb
 */
public class Game {

    private SpecialNumbers specialNumbers;

    public Game(SpecialNumbers specialNumbers) {
        this.specialNumbers = specialNumbers;
    }

    public String call(int input) {
        int firstNumber = specialNumbers.getNumbers()[0];
        int secondNumber = specialNumbers.getNumbers()[1];
        int thirdNumber = specialNumbers.getNumbers()[2];

        if (firstNumber % input == 0) {
            return OutputEnum.FIZZ.getName();
        } else if (secondNumber % input == 0) {
            return OutputEnum.BUZZ.getName();
        } else if (thirdNumber % input == 0) {
            return OutputEnum.WHIZZ.getName();
        } else {
            return null;
        }
    }
}
