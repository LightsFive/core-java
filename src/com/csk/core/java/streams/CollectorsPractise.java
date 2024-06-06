package com.csk.core.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsPractise {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Krishna");
        Employee emp2 = new Employee(2, "Krishna1");
        Employee emp3 = new Employee(3, "Krishna1");
        Employee emp4 = new Employee(4, "Krishna");

        List<Employee> list = new ArrayList<>();

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);

        /*var map = list.stream()
                .collect(Collectors.toMap(emp -> emp.getName(), emp -> emp.getId()));*/

        var map = list.stream()
                .collect(Collectors.groupingBy(Employee::getName));

        System.out.println(map.size());

        map.forEach((k, v) -> System.out.println(k + " " + v.size()));

        var count = list.stream()
                .collect(Collectors.groupingBy(emp -> emp.name, Collectors.summarizingInt(Employee::getId)));

        count.forEach((key, value) -> System.out.println(key + " " + value.getCount() + " " + value.getMax() + " " + value.getMin() + " " + value.getSum()));

        System.out.println("Print Employee count with same name");

        Map<String, Long> groupByName = list.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        groupByName.forEach((k,v) -> System.out.println(k + " " + v));

    }

    static class Employee {

        int id;
        String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
