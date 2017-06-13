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
        int[] baseNumbers = specialNumbers.getNumbers();

        int firstNumber = baseNumbers[0];
        if (isMultiple(input, firstNumber)) {
            result += OutputEnum.FIZZ.getName();
        }

        int secondNumber = baseNumbers[1];
        if (isMultiple(input, secondNumber)) {
            result += OutputEnum.BUZZ.getName();
        }

        int thirdNumber = baseNumbers[2];
        if (isMultiple(input, thirdNumber)) {
            result += OutputEnum.WHIZZ.getName();
        }

        return result;
    }

    private boolean isMultiple(int input, int base) {
        return input % base == 0;
    }
}
