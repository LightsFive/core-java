package com.csk.core.java.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

    public static void main(String[] args) {

        try (FileInputStream file = new FileInputStream("employee.ser"); ObjectInputStream stream = new ObjectInputStream(file)) {

            SerializeDemo.Employee emp = (SerializeDemo.Employee) stream.readObject();

            System.out.println(emp.getName());
        } catch (FileNotFoundException ex) {

            ex.printStackTrace();
        } catch (IOException ex) {

            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {

            ex.printStackTrace();
        }

    }
}
