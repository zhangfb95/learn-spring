package com.learn.spring.guess;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author zhangfb
 */
public class GuessTest {

    @Test
    public void should_say_fizz_when_input_is_multiple_of_number_one() {
        final int firstNumber = 3;
        int[] numbers = {firstNumber, 5, 7};
        SpecialNumbers specialNumbers = new SpecialNumbers(numbers);
        Game game = new Game(specialNumbers);

        String output = game.call(firstNumber);
        assertThat(output, is(OutputEnum.FIZZ.getName()));
    }

    @Test
    public void should_say_buzz_when_input_is_multiple_of_number_one() {
        final int secondtNumber = 5;
        int[] numbers = {3, secondtNumber, 7};
        SpecialNumbers specialNumbers = new SpecialNumbers(numbers);
        Game game = new Game(specialNumbers);

        String output = game.call(secondtNumber);
        assertThat(output, is(OutputEnum.BUZZ.getName()));
    }

    @Test
    public void should_say_whizz_when_input_is_multiple_of_number_one() {
        final int thirdNumber = 7;
        int[] numbers = {3, 5, thirdNumber};
        SpecialNumbers specialNumbers = new SpecialNumbers(numbers);
        Game game = new Game(specialNumbers);

        String output = game.call(thirdNumber);
        assertThat(output, is(OutputEnum.WHIZZ.getName()));
    }
}
