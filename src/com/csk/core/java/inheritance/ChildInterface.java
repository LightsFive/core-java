package com.csk.core.java.inheritance;

public class ChildInterface implements ParentInterface, OtherInterface {

    @Override
    public void print() {

        System.out.println("Child Interface");

    }

    @Override
    public void defaultPrint() {
        OtherInterface.super.defaultPrint();
    }

    public static void main(String[] args) {

        ParentInterface p = new ChildInterface();

        p.defaultPrint();

        ChildInterface c = new ChildInterface();
        c.defaultPrint();

        OtherInterface o = new ChildInterface();
        o.print();

        ParentInterface.stream();
        OtherInterface.stream();
    }
}
