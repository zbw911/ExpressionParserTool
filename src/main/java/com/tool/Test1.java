package com.tool;

public class Test1 {

    public static void main(String[] args) {

        String s1 = "(1 + 2) == 3";
        System.out.println(ExpressionEvaluator.eval(s1));

        String s2 = "(20 - 6) < 3";
        System.out.println(ExpressionEvaluator.eval(s2));

        String s3 = "(3 + 1) == 4 && 5 > (2 + 3)";
        System.out.println(ExpressionEvaluator.eval(s3));

        String s4 = "\"hello\" == \"hello\" && 3 != 4";
        System.out.println(ExpressionEvaluator.eval(s4));

        String s5 = "\"helloworld\" @ \"hello\" &&  \"helloworld\" !@ \"word\" ";
        System.out.println(ExpressionEvaluator.eval(s5));
    }
}
