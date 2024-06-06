package com.csk.core.java.inheritance;

public class Parent {

    protected Exception print() throws Exception {
        System.out.println("Parent");
        return new Exception("Parent Exception");
    }

    protected final void show() throws Exception {
        int a = 2 / 1;
        System.out.println("Parent");
    }
}
