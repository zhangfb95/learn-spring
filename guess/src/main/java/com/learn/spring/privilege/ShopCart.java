package com.learn.spring.privilege;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangfb
 */
public class ShopCart {

    private List<Goods> goodsList = new ArrayList<Goods>();

    public void add(Goods goods) {
        goodsList.add(goods);
    }

    public BigDecimal calc() {
        BigDecimal result = BigDecimal.ZERO;
        for (Goods goods : goodsList) {
            if (goods.getType() == TypeEnum.NO) {
                result = result.add(goods.getPrice().multiply(new BigDecimal(goods.getNum())));
            } else if (goods.getType() == TypeEnum.EIGHT_ZHE) {
                result = result.add(goods.getPrice().multiply(new BigDecimal(goods.getNum())).multiply(new BigDecimal("0.80")));
            }
        }
        return result;
    }
}
