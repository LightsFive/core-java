package com.csk.core.java.inheritance;

import java.util.List;

public interface OtherInterface {

    void print();

    default void defaultPrint() {
        System.out.println("Other Interface");
    }

    static void stream() {

        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .forEach(System.out::println);
    }
}
