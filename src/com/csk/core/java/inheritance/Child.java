package com.csk.core.java.inheritance;

import java.util.List;

public class Child extends Parent implements ParentInterface {

    int sliblings;
    final int parents;

    Child() {
        System.out.println("Siblings: " + this.sliblings);
        System.out.println("Parents: " + this.parents);
    }

    {
        this.sliblings = 2;
        this.parents = 1;
    }

    @Override
    public ArithmeticException print() throws ArithmeticException {
        ParentInterface.super.defaultPrint();
        System.out.println("Child");
        return new ArithmeticException("Child Exception");
    }

    // Final methods cannot be overriden
    /*@Override
    protected void show() throws Exception {
        int a = 2 / 1;
        System.out.println("Parent");
    }*/

    void stream() {

        List.of(1, 2, 3, 4)
                .forEach(System.out::println);
    }

    static int add(int a, int b) throws Exception {
        return a + b;
    }

    static double add(int a, int b, int c) throws ArithmeticException {
        return a + b + c;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Child Finalize method is executed..");
    }

    public static void main(String[] args) throws Exception {

        Parent c = new Child();
        var exception = (ArithmeticException) c.print();

        Child c1 = new Child();
        var arithmeticException = c1.print();

        Parent p = new Parent();
        var parentException = p.print();

        System.out.println(add(10, 20, 40));

        System.gc();
    }
}
