package com.csk.core.java.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetExample {

    public static void main(String[] args) {

        Employee krishna = new Employee(1, "Krishna");
        Employee gayathri = new Employee(2, "Gayathri");
        Employee amma = new Employee(3, "Amma");

        var set = new TreeSet<Employee>(Comparator.comparing(o -> o.id));

        set.add(krishna);
        set.add(gayathri);
        set.add(amma);
    }

    static class Employee {

        Integer id;
        String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
