package com.csk.core.java.inheritance;

import java.util.List;

public interface ParentInterface {

    //void print();

    default void defaultPrint() {
        System.out.println("Parent Interface");
    }

    static void stream() {

        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
                .forEach(System.out::println);
    }

    private int add(int a, int b) {
        return a + b;
    }
}
