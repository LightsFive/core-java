package com.csk.core.java.streams;

import java.util.List;

public class Reduce {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> evenList = List.of(2, 4, 6, 8, 10);

        String result = list.stream()
                .filter(i -> i % 2 != 0)
                .map(String::valueOf)
                .reduce("", (a, b) -> a + b);

        System.out.println(result);


        String result1 = evenList.stream()
                .filter(i -> i % 2 == 0)
                .map(String::valueOf)
                .reduce("Krishna", (a, b) -> a + b);

        System.out.println(result1);
    }
}
