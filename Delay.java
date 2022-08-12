package com.ProjectOOP;

public class Delay {
    private int milliSecond;

    public void setMilliSecond(int milliSecond) {
        this.milliSecond = milliSecond;
    }

    public int getMilliSecond() {
        return this.milliSecond;
    }

    public static void delay() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.err.println("Error Cuy");
        }
    }

    public static void delayBaru() {
        try {
            Thread.sleep(1135);
        } catch (Exception r) {
            System.err.println("Malah Eror");
        }
    }

    public static void delayBaruAsl() {
        try {
            Thread.sleep(1000);
        } catch (Exception r) {
            System.err.println("Malah Eror");
        }
    }
}
