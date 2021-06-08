package com.tool;

public class Test2 {

    public static void main(String[] args) {

        //加法运算
        String plusStr = "1 + 2";
        System.out.println(ExpressionEvaluator.eval(plusStr));

        //减法运算
        String subtractStr = "20 - 6";
        System.out.println(ExpressionEvaluator.eval(subtractStr));

        //乘法运算
        String multiPlyStr = "3 * 5";
        System.out.println(ExpressionEvaluator.eval(multiPlyStr));

        //除法运算
        String divideStr = "20 / 4";
        System.out.println(ExpressionEvaluator.eval(divideStr));

        //次幂运算
        String powerStr = "2 ^ 3";
        System.out.println(ExpressionEvaluator.eval(powerStr));

        //取余运算
        String modStr = "4 % 3";
        System.out.println(ExpressionEvaluator.eval(modStr));

        //混合运算
        String resultStr = "(1 + 2) - 4 * 3 + 2^2 + 4%3";
        System.out.println(ExpressionEvaluator.eval(resultStr));
    }
}
