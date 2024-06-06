package com.csk.core.java.cloning;

import java.util.*;

/*
 By Default clone method supports shallow cloning, we can override it to support Deep Cloning
 */
public class Student implements Cloneable, Comparable<Student> {

    int rollNo;
    String name;
    Address address;

    Student(int rollNo, String name, Address address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    /*Student(Student student) {

        this(student.rollNo, student.name, new Address(student.address));
    }*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = null;

        student = (Student) super.clone();

        var address = (Address) this.address.clone();
        student.setAddress(address);

        return student;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        var address = new Address("Kurnool", "AP");
        Student st1 = new Student(1, "Krishna", address);
        Student st3 = new Student(2, "Krishna", address);
        Student st4 = new Student(3, "Krishna", address);

        var st2 = (Student) st1.clone();

        System.out.println(st1.name + " " + st1.address.city);
        System.out.println(st2.name + " " + st2.address.city);

        System.out.println(st1.equals(st2));
        System.out.println(st1.address.equals(st2.address));

        Arrays.stream(args).forEach(System.out::println);

        var list = List.of(st1, st2, st3, st4);

        list.stream()
                .sorted(Comparator.comparing(s -> s.name))
                .map(Student::getRollNo)
                .forEach(System.out::println);
    }

    @Override
    public int compareTo(Student o) {
        if (this.rollNo == o.rollNo) {
            return 0;
        }
        else if (this.rollNo > o.rollNo) {
            return 1;
        }
        else {
            return -1;
        }
    }

    static class Address implements Cloneable {

        String city;
        String country;

        Address(String city, String country) {

            this.city = city;
            this.country = country;
        }

        Address(Address address) {
            this(address.city, address.country);
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return (Address) super.clone();
        }
    }
}
