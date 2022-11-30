package com.tg;

public class Main {
    public static void main(String[] args) {

        Runnable run1 = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        new Thread(run1).start();
    }
}
