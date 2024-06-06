package com.csk.core.java.serialization;

import java.io.*;

public class SerializeDemo {

    public static void main(String[] args) {

        Employee emp = new Employee("Krishna", "Nandyala", 2345, 9887);

        try (FileOutputStream file = new FileOutputStream("employee.ser"); ObjectOutputStream stream = new ObjectOutputStream(file)) {

            stream.writeObject(emp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class Employee implements Serializable {

        private String name;
        private String address;
        private int ssn;
        private int number;

        public Employee(String name, String address, int ssn, int number) {
            this.name = name;
            this.address = address;
            this.ssn = ssn;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public int getSsn() {
            return ssn;
        }

        public int getNumber() {
            return number;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setSsn(int ssn) {
            this.ssn = ssn;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
