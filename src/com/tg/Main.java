package com.tg;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Function<String /*parameter*/, String /*return value*/> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };
        System.out.println(everySecondCharacter(lambdaFunction, "1234567890"));

        Supplier<String> supplier = () -> "Today is Monday"; // Supplier produces objects
    }

    public static String everySecondCharacter(Function<String, String> func, String s1) {
        return func.apply(s1);
    }
}
