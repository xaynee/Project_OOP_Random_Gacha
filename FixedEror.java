package com.ProjectOOP;

public class FixedEror {
    private String nama;
    private int password;
    private boolean isRobot;

    public FixedEror() {

        this.isRobot = true;
    }

    public boolean getIsRobot() {
        return this.isRobot;

    }

    public void login(String name, int password) {
        if (name.equals(this.nama) && password == this.password) {
            this.isRobot = false;
        } else {
            this.isRobot = true;
        }
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

    public static void delayBaruLoading() {
        try {
            Thread.sleep(100);
        } catch (Exception r) {
            System.err.println("Malah Eror");
        }
    }

    public static void loading() {
        char[] loading = { '|', '>', '>', '>', '>', 'S', 'e', 'd', 'a', 'n', 'g', ' ', 'M', 'e', 'n', 'g', 'a',
                'c', 'a', 'k', '<', '<', '<', '<', '|' };
        boolean ulang3 = true;
        while (ulang3) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < loading.length; j++) {
                    System.out.print(loading[j]);
                    FixedEror.delayBaruLoading();
                }
                MainAPP.clearScreen();
                if (i <= 5) {
                    ulang3 = false;
                }
            }
        }

    }

    public static void loadScreen() {
        char[] loading = { '|', '>', '>', '>', '>', 'S', 'e', 'd', 'a', 'n', 'g', ' ', 'M', 'e', 'm', 'u', 'a',
                't', '<', '<', '<', '<', '|' };
        boolean ulang3 = true;
        while (ulang3) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < loading.length; j++) {
                    System.out.print(loading[j]);
                    FixedEror.delayBaruLoading();
                }
                MainAPP.clearScreen();
                if (i <= 5) {
                    ulang3 = false;
                }
            }
        }

    }
}