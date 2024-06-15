package com.lella.java.core.basic;

public class ClassLoaderExample  extends ClassLoader{

    public static void main(String...args) {
        System.out.println(ClassLoaderExample.class.getClassLoader()); //System/Application class loader will load this class on JVM
        System.out.println(String.class.getClassLoader()); //Bootstrap class loader will loadthis
    }
}
