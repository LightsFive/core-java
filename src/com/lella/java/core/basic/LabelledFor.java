package com.lella.java.core.basic;

public class LabelledFor {
    /**
     * This method usually prints a left right angle triangle pattern
     * for 10 lines , to restrict it for 5 lines we used break to break the external loop ( normally break breaks only
     * th internal loop to understand labelledFor we followed this approach
     * FYI you will get sonar issue for labels ;)
     */

    void multiForLoop() {
        loop1:
        for (int i = 0; i < 10; i++) {
            loop2:
            for (int j = 0; j <= i; j++) {
                if (i == 6) {
                    break loop1;
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        LabelledFor l = new LabelledFor();
        l.multiForLoop();
    }
}
