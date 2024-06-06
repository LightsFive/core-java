package com.csk.core.java.collections;

import java.util.*;

public class PractiseMap {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Krishna");
        Employee emp2 = new Employee(1, "Krishna");

        System.out.println(emp1.equals(emp2));

        System.out.println("Hash 1 " + emp1.hashCode());
        System.out.println("Hash 2 " + emp2.hashCode());

        Map<Employee, Integer> map = new HashMap<>();


        map.put(emp1, 1);
        map.put(emp2, 2);

        System.out.println(map.size());

        map.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println(map.get(emp1));
        System.out.println(map.get(emp2));

    }

    static class Employee {

        private final Integer id;
        private final String name;

        public Employee(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Objects.equals(id, employee.id) && Objects.equals(name, employee.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
