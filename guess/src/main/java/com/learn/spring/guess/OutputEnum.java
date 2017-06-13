package com.learn.spring.guess;

/**
 * @author zhangfb
 */
public enum OutputEnum {

    FIZZ("fizz"),
    BUZZ("buzz"),
    WHIZZ("whizz");

    private String name;

    OutputEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
