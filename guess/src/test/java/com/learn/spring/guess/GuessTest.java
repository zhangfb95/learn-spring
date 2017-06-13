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
}
