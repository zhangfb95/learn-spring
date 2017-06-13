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
        String result = "";

        int firstNumber = specialNumbers.getNumbers()[0];
        if (input % firstNumber == 0) {
            result += OutputEnum.FIZZ.getName();
        }

        int secondNumber = specialNumbers.getNumbers()[1];
        if (input % secondNumber == 0) {
            result += OutputEnum.BUZZ.getName();
        }

        int thirdNumber = specialNumbers.getNumbers()[2];
        if (input % thirdNumber == 0) {
            result += OutputEnum.WHIZZ.getName();
        }

        return result;
    }
}
