package com.learn.spring.privilege;

import java.math.BigDecimal;

/**
 * @author zhangfb
 */
public class Goods {

    private TypeEnum type;
    private String name;
    private BigDecimal price;
    private int num;

    public Goods(TypeEnum type, String name, BigDecimal price, int num) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public TypeEnum getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getNum() {
        return num;
    }
}
