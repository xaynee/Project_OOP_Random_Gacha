package com.ProjectOOP;

import java.net.SocketOption;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class MainAPP {

    public static void main(String[] args) {

        boolean ulang1 = true;
        boolean ulang2 = true;

        int maxTry = 5;

        while (ulang1) {

            clearScreen();
            FixedEror.loadScreen();
            Scanner userInput = new Scanner(System.in);
            System.out.println("|==================|");
            System.out.println("|  Buat Akun Anda  |");
            System.out.println("|==================|");
            System.out.print("|Nama Akun         :");
            String nama = userInput.nextLine();
            DelayChild.delayBaruAsl();
            System.out.print("|Password Akun     :");
            int password = userInput.nextInt();
            Form form1 = new Form(nama, password);
            System.out.println("|==================|\n\n");
            Delay.delay();
            System.out.println(">>Pembuatan akun berhasil<<");
            Delay.delayBaru();
            Random random1 = new Random();
            clearScreen();

            System.out.println("|===================|");
            System.out.println("|  Login Akun Anda  |");
            System.out.println("|===================|");
            System.out.print("|Nama akun anda     :");
            String name = userInput.next();
            Delay.delayBaruAsl();
            System.out.print("|Password Akun Anda :");
            int pw = userInput.nextInt();
            System.out.println("|===================|\n\n");
            form1.login(name, pw);
            if (!form1.getIsRobot()) {
                Delay.delayBaru();
                System.out.println("Login Berhasil");
                if (form1.getIsRobot() == false) {
                    ulang1 = false;
                }
            } else {
                System.out.println("Maaf Input Yang Anda Masukkan salah");

            }

            FixedEror.loadScreen();
            clearScreen();
            maxTry -= 1;
            if (maxTry == 0) {
                salahLogin();
            }

            FixedEror fixed1 = new FixedEror();
            if (form1.getIsRobot() == false) {

                while (ulang2) {
                    System.out.println("|==========================================|");
                    System.out.println("| Selamat datang di Gacha Antariksa Mobile |");
                    System.out.println("|==========================================|");
                    System.out.print("|Mau gacha berapa kali?                    :");
                    int gacha = userInput.nextInt();
                    System.out.println("|==========================================|");
                    clearScreen();
                    char[] loading = { '|', '>', '>', '>', '>', 'S', 'e', 'd', 'a', 'n', 'g', ' ', 'M', 'e', 'n', 'g',
                            'a', 'c', 'a', 'k', '<', '<', '<', '<', '|' };
                    boolean ulang3 = true;
                    while (ulang3) {
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < loading.length; j++) {
                                System.out.print(loading[j]);
                                fixed1.delayBaruLoading();
                            }

                            if (i < 5) {
                                ulang3 = false;
                                clearScreen();
                            }
                        }
                    }

                    clearScreen();
                    System.out.println(
                            "|>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Selamat, Anda mendapatkan<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<|\n\n");
                    for (int i = 1; i <= gacha; i++) {
                        if (i > 10) {
                            break;
                        }
                        System.out.println(
                                "|==========================================================================================|");
                        System.out.println(
                                "|                                    Informasi Character                                   |");
                        System.out.println(
                                "|==========================================================================================|");
                        System.out.println("|Character\t:" + Random.randomChar() + "\n" + "|Skill Pasif\t:"
                                + Random.pasifSkill(Random.randomChar()) + "\n" +
                                "|Basic Attack\t:" + Random.BasicAttack(Random.randomChar()) + "\n" + "|Skill Satu\t:"
                                + Random.SkillSatu(Random.randomChar()) + "\n" +
                                "|Skill Dua\t:" + Random.SkillDua(Random.randomChar()) + "\n" + "|Ultimate\t:"
                                + Random.Ultimate(Random.randomChar()) + "\n" + "|Damage Bawaan\t:"
                                + Random.damage(Random.randomChar()));
                        System.out.println(
                                "|------------------------------------------------------------------------------------------|\n\n");
                        DelayChild.delayBaru();

                    }

                    System.out.print("Ingin Gacha Lagi?y/t\t:");
                    String gachaUlang = userInput.next();
                    if (gachaUlang.equalsIgnoreCase("y")) {
                        ulang2 = true;
                        clearScreen();
                        FixedEror.loadScreen();

                    } else if (gachaUlang.equalsIgnoreCase("t")) {
                        ulang2 = false;
                        selesai();
                    } else {
                        System.out.println("SALAH GOBLOG");
                    }

                }

            }
        }

    }

    static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            }
        } catch (final Exception e) {
            System.out.println("Error karena: " + e.getMessage());
        }

    }

    public static void selesai() {
        clearScreen();
        System.out.println("|--==--==--==--==--==--==--==--==--|");
        System.out.println("|Anda telah keluar  dari menu gacha|");
        System.out.println("|--==--==--==--==--==--==--==--==--|");
    }

    public static void salahLogin() {
        clearScreen();
        System.out.println("|=--=--=--=--=--=--=--=--=--=--=--=--=|");
        System.out.println("|  Maaf, anda salah memasukkan akun   |");
        System.out.println("|=--=--=--=--=--=--=--=--=--=--=--=--=|");
    }

}
