package com.learn.spring.spel;

import com.learn.spring.spel.bean.Inventor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * @author zhangfb
 */
public class Main {

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("name");

        Inventor tesla = new Inventor("Nikola Tesla", 332L, "Serbian");

        EvaluationContext context = new StandardEvaluationContext(tesla);
        String message = exp.getValue(context, String.class);
        System.out.println(message);

        String message2 = exp.getValue(context, String.class);
        System.out.println(message2);
    }
}
