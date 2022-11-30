package com.tg;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Today is Monday"; // Supplier produces objects
        String supplierResult = supplier.get();
        System.out.println(supplierResult);
    }
}
