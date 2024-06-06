package com.csk.core.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {

        var list = new ArrayList<Dog>();

        list.add(new Dog("Shaggy", 3));
        list.add(new Dog("Ammy", 30));
        list.add(new Dog("Lacy", 2));
        list.add(new Dog("Roger", 10));
        list.add(new Dog("Tommy", 4));
        list.add(new Dog("Tammy", 1));

        Collections.sort(list, Comparator.comparing(d -> d.name));

        list.forEach(System.out::println);

        System.out.println("Sorting By Id.......");

        Collections.sort(list, (d1, d2) -> d1.id - d2.id);

        list.forEach(System.out::println);

        System.out.println("Sorting By Id.......");

        Collections.sort(list, Comparator.comparingInt(d -> d.id));

        list.forEach(System.out::println);


    }

    static class Dog {

        String name;
        int id;

        public Dog(String name, int id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
}
