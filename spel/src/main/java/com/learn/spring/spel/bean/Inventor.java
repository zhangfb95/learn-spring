package com.learn.spring.spel.bean;

/**
 * @author zhangfb
 */
public class Inventor {

    private String name;
    private long time;
    private String anotherName;

    public Inventor(String name, long time, String anotherName) {
        this.name = name;
        this.time = time;
        this.anotherName = anotherName;
    }

    public String getName() {
        return name;
    }

    public long getTime() {
        return time;
    }

    public String getAnotherName() {
        return anotherName;
    }
}
