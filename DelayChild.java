package com.ProjectOOP;

import java.io.ObjectInputStream.GetField;

public class DelayChild extends Delay {

    public static void delay() {
        Delay delay2 = new Delay();
        try {
            delay2.setMilliSecond(3000);
            Thread.sleep(delay2.getMilliSecond());
        } catch (Exception e) {
            System.err.println("Error Cuy");
        }
    }

    public static void delayBaruAsl() {
        Delay delay2 = new Delay();
        try {
            delay2.setMilliSecond(500);
            Thread.sleep(delay2.getMilliSecond());
        } catch (Exception e) {
            System.err.println("Error Cuy");
        }
    }

}
