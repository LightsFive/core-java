package com.lella.java.core.basic;

public class CommandLineArgs {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            System.out.println("Started");
            System.out.println(args[i]);
        }
    }
}
