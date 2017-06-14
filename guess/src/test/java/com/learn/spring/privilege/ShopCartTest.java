package com.learn.spring.privilege;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author zhangfb
 */
public class ShopCartTest {

    @Test
    public void should_return_source_price_when_no_privilege() {
        // given
        ShopCart cart = new ShopCart();
        Goods goods = new Goods(TypeEnum.NO, "C", new BigDecimal("10"), 3);
        cart.add(goods);

        // when
        BigDecimal totalPrice = cart.calc();

        // then
        assertThat(totalPrice, is(goods.getPrice().multiply(new BigDecimal(goods.getNum()))));
    }

    @Test
    public void should_return_eight_zhe_when_eight_zhe_privilege() {
        // given
        ShopCart cart = new ShopCart();
        Goods goods = new Goods(TypeEnum.EIGHT_ZHE, "A", new BigDecimal("100"), 3);
        cart.add(goods);

        // when
        BigDecimal totalPrice = cart.calc();

        // then
        assertThat(totalPrice, is(goods.getPrice().multiply(new BigDecimal(goods.getNum())).multiply(new BigDecimal("0.80"))));
    }
}
