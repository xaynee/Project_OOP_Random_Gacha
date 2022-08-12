package com.ProjectOOP;

import java.util.Scanner;

import javax.swing.Icon;
import javax.xml.transform.Source;

public class Random {

    public static String randomChar() {
        String character;
        double random = Math.random() * 10 + 1;
        int matIn = (int) random;
        switch (matIn) {
            case 1:
                return character = "Puan";
            case 2:
                return character = "Xiao Bai";
            case 3:
                return character = "Jokowi";
            case 4:
                return character = "Soeharto";
            case 5:
                return character = "Megawati";
            case 6:
                return character = "Yanto";
            case 7:
                return character = "Yanti";
            case 8:
                return character = "Bayu";
            case 9:
                return character = "Dwika";
            case 10:
                return character = "Soekarno";
            case 11:
                return character = "Keris";
            case 12:
                return character = "Celurit";
            case 13:
                return character = "Belati";
            case 14:
                return character = "Parang Salawaku";
            case 15:
                return character = "Mandau";
            case 16:
                return character = "Rencong";
            case 17:
                return character = "Badik";
            case 18:
                return character = "Kujang";
            case 19:
                return character = "Golok";
            case 20:
                return character = "Klewang";
            case 21:
                return character = "Kurambiak";
            case 22:
                return character = "Pedang Jenawi";
            case 23:
                return character = "Karih Sumbar";
            case 24:
                return character = "Tombak Mata Panah";
            case 25:
                return character = "Tombak Payan";
            case 26:
                return character = "Sumpit kaltim";
            case 27:
                return character = "Dohong Tenggara";
            case 28:
                return character = "Keris Bujak Beliung";
            case 29:
                return character = "Golok Ciomas";
            case 30:
                return character = "Keris Bali";
            case 31:
                return character = "Sundu";
            default:
                return character = "bayu";
        }
    }

    public static String pasifSkill(String character) {
        String pasif;
        if (character == "Puan") {
            return pasif = "Menghilangkan lawan ketika lawan memberikan kritikan";
        } else if (character == "Xiao Bai") {
            return pasif = "Ketika stuck penuh, Xiao Bai akan mengembalikan 50% damage serangan lawan ";
        } else if (character == "Jokowi") {
            return pasif = "Memberikan heal ke teman satu tim setiap 5 menit";
        } else if (character == "Soeharto") {
            return pasif = "Ketika stuck penuh, Soeharto dapat langsung membunuh lawan yang diinginkan";
        } else if (character == "Megawati") {
            return pasif = "Invisible selama 10 detik ketika Healt Point= 300(CoolDown selama 1 menit)";
        } else if (character == "Yanto") {
            return pasif = "Melemparkan pisau ke arah lawan(Damage 7000) ";
        } else if (character == "Yanti") {
            return pasif = "Melemparkan bunga melati yang membuat lawan menerima efek slow";
        } else if (character == "Bayu") {
            return pasif = "Membuat ledakan di area musuh dan membuat musuh terdiam selama 4 detik";
        } else if (character == "Dwika") {
            return pasif = "Memberikan efek blind kepada lawan selama 5 detik";
        } else if (character == "Soekarno") {
            return pasif = "Memberikan heal ke teman satu tim ketika hp kurang dari 20%";
        } else if (character == "Keris") {
            return pasif = "Memunculkan aura merah disepanjang area player(Damage Aura : 700)";
        } else if (character == "Celurit") {
            return pasif = "Memberikan heal ke player selama 10 detik(Cooldown 1 Menit)";
        } else if (character == "Belati") {
            return pasif = "Memberikan sensasi tusukan ke arah lawan(jarak 50m dari posisi player)";
        } else if (character == "Parang Salawaku") {
            return pasif = "Memberikan Shield ke player(Shield memberikan tambahan damage)";
        } else if (character == "Mandau") {
            return pasif = "Meningkatkan Batas Healt Point Dari Player";
        } else if (character == "Rencong") {
            return pasif = "Rencong memperkuat skill pasif dari penggunanya";
        } else if (character == "Badik") {
            return pasif = "Membuat player mengurangi setengah durasi dari efek stun";
        } else if (character == "kujang") {
            return pasif = "Membuat pengguna tahan terhadap damage nature selama 5 detik";
        } else if (character == "Golok") {
            return pasif = "Menambah maksimum damage sebanyak 700";
        } else if (character == "Klewang") {
            return pasif = "Meningkatkan physical damage sebanyak 20%";
        } else if (character == "Kurambiak") {
            return pasif = "Memberikan true damage kepada lawan melalui basic attack";
        } else if (character == "Pedang Jenawi") {
            return pasif = "Meningkatkan physical damage sebanyak 15%";
        } else if (character == "Karih Sumbar") {
            return pasif = "Meningkatkan Magic Damage sebanyak 20%";
        } else if (character == "Tombak Mata Panah") {
            return pasif = "Meningkatkan damage 30% ketika digunakan oleh hero jarak jauh";
        } else if (character == "Tombak Payan") {
            return pasif = "Ketika fragment dari tombak payan menyatu, pemain akan terkena efek rage selama 10 detikj";
        } else if (character == "Sumpit Kaltim") {
            return pasif = "Meningkatkan kemampuan regenerasi sebanyak 30% selama 5 detik";
        } else if (character == "Dohong Tenggara") {
            return pasif = "Meningkatkan damage dari basic attack sebanyak 18%";
        } else if (character == "Keris Bujak Beliung") {
            return pasif = "Meningkatkan magic damage sebesar 30%";
        } else if (character == "Golok Ciomas") {
            return pasif = "Meningkatkan Physical damage sebesar 5%";
        } else if (character == "Keris Bali") {
            return pasif = "Meningkatkan Magic Damage sebesar 35%";
        } else if (character == "Sundu") {
            return pasif = "Meningkatkan Physical damage sebesar 10%";
        } else {
            return pasif = "Null";
        }
    }

    public static String BasicAttack(String character) {
        String BasicAtt;
        if (character == "Puan") {
            return BasicAtt = "Melemparkan tanduk banteng";
        } else if (character == "Xiao Bai") {
            return BasicAtt = "Menembak target menggunakan panah";
        } else if (character == "Jokowi") {
            return BasicAtt = "Melemparkan sepeda ke lawan";
        } else if (character == "Soeharto") {
            return BasicAtt = "Menembak target dengan menggunakan gelombang suara";
        } else if (character == "Megawati") {
            return BasicAtt = "Memukul target menggunakan tangan kosong";
        } else if (character == "Yanto") {
            return BasicAtt = " Menyerang target dengan menggunakan bola bola api ";
        } else if (character == "Yanti") {
            return BasicAtt = "Melemparkan bunga ke arah target";
        } else if (character == "Bayu") {
            return BasicAtt = "Melemparkan tombak ke arah target";
        } else if (character == "Dwika") {
            return BasicAtt = "Menusuk lawan dengan menggunakan pedang";
        } else if (character == "Soekarno") {
            return BasicAtt = "Menyerang target dengan menggunakan bambu runcing";
        } else {
            return BasicAtt = "null";
        }

    }

    public static String SkillSatu(String character) {
        String SkillSt;
        if (character == "Puan") {
            return SkillSt = "Memanggil banteng merah untuk membantu puan menyerang lawan+";
        } else if (character == "Xiao Bai") {
            return SkillSt = "Memberikan efek ganda kepada panah yang ditembakkan ke arah lawan";
        } else if (character == "Jokowi") {
            return SkillSt = "Membunyikan lonceng sepeda yang membuat hero lawan susah dikendalikan(HornBe Efect)";
        } else if (character == "Soeharto") {
            return SkillSt = "Melesatkan peluru ke arah lawan tanpa bersuara";
        } else if (character == "Megawati") {
            return SkillSt = "melintarkan cairan minyak yang membuat lawan terkena efek slow";
        } else if (character == "Yanto") {
            return SkillSt = " Mengembuskan nafas api yang membuat lawan terkena efek knockback";
        } else if (character == "Yanti") {
            return SkillSt = "Menumbukan semak belukar yang membuat Yanti tidak terlihat oleh lawan selama 5 detik";
        } else if (character == "Bayu") {
            return SkillSt = "Melempar tombak ke tanah dan menciptakan area listrik yang membatasi gerakan lawan";
        } else if (character == "Dwika") {
            return SkillSt = "Melompat ke arah lawan dan memberikan damage disekitar area loncatan";
        } else if (character == "Soekarno") {
            return SkillSt = "Melafalkan doa makan yang membuat lawan kehilangan 20% healt point";
        } else {
            return SkillSt = "null";
        }

    }

    public static String SkillDua(String character) {
        String SkillDa;
        if (character == "Puan") {
            return SkillDa = "Menaruh jebakan berupa janji janji palsu(Lawan terkena efek stun selama 3 detik)";
        } else if (character == "Xiao Bai") {
            return SkillDa = "Meluncurkan hujan anak panah beracun(Lawan akan menerima 200 damage selama 5 detik)";
        } else if (character == "Jokowi") {
            return SkillDa = "Memberikan pertanyaan ke lawan( lawan akan terkena damage berkelanjutan selama 9 detik)";
        } else if (character == "Soeharto") {
            return SkillDa = "Melemparkan Bom ke arah lawan";
        } else if (character == "Megawati") {
            return SkillDa = "Memanggil para DPR untuk menyerang lawan(Setelah 5 detik DPR akan kembali tertidur)";
        } else if (character == "Yanto") {
            return SkillDa = " Meluncur/dash ke arah lawan(muncul api di area pijakan selama meluncur, durasi 5 detik) ";
        } else if (character == "Yanti") {
            return SkillDa = "Membuat area wewangian kembang bunga(lawan tertarik ke arah Yanti saat berada di jangkauan)";
        } else if (character == "Bayu") {
            return SkillDa = "Teleportasi ke arah lawan";
        } else if (character == "Dwika") {
            return SkillDa = "Mengayunkan dan memutarkan pedang ";
        } else if (character == "Soekarno") {
            return SkillDa = "Memanggil panglima perang soedirman untuk mengalihkan perhatian lawan";
        } else {
            return SkillDa = "null";
        }

    }

    public static String Ultimate(String character) {
        String Ulti;
        if (character == "Puan") {
            return Ulti = "Memberikan efek amarah ke banteng dari hasil summon skill satu";
        } else if (character == "Xiao Bai") {
            return Ulti = "Membuat kurungan yang bisa menjebak lawan Xiao Bai akan meloncat dan menembakkan panah ke arah lawan)";
        } else if (character == "Jokowi") {
            return Ulti = "Mengeluarkan infrastruktur yang tidak merata(lawan akan terknockback ke udara dan terkena slow,durasi 5 detik)";
        } else if (character == "Soeharto") {
            return Ulti = "Memberikan efek amarah ke diri sendiri selama 30 detik";
        } else if (character == "Megawati") {
            return Ulti = "Meledakkan diri hingga membunuh lawan dan diri sendiri(Megawati mengeluarkan DPR yang diberikan efek rage";
        } else if (character == "Yanto") {
            return Ulti = "Saat memakai ulti, Healt Point dari Yanto tidak akan berkurang ketika di hit oleh lawan(Durasi selama 1 menit)";
        } else if (character == "Yanti") {
            return Ulti = "Yanti akan berubah menjadi gadis yang sangat cantik(Lawan akan terpikat lalu Healt Point akan berkurang 90%)";
        } else if (character == "Bayu") {
            return Ulti = "Menendang dan mengikat lawan di medan listrik buatan";
        } else if (character == "Dwika") {
            return Ulti = "Menghempaskan pedang dan membuat medan yang menyebabkan lawan terkena efek slow ";
        } else if (character == "Soekarno") {
            return Ulti = "Melompat ke area tower musuh dan mengurangi Healt Point tower sebanyak 80% dari Healt Point penuh";
        } else {
            return Ulti = "null";
        }

    }

    public static int damage(String character) {
        int dmg;
        if (character == "Puan") {
            return dmg = 5000;
        } else if (character == "Xiao Bai") {
            return dmg = 4900;
        } else if (character == "Jokowi") {
            return dmg = 4850;
        } else if (character == "Soeharto") {
            return dmg = 4800;
        } else if (character == "Megawati") {
            return dmg = 4750;
        } else if (character == "Yanto") {
            return dmg = 3000;
        } else if (character == "Yanti") {
            return dmg = 2990;
        } else if (character == "Bayu") {
            return dmg = 4900;
        } else if (character == "Dwika") {
            return dmg = 4800;
        } else if (character == "Soekarno") {
            return dmg = 6000;
        } else {
            return dmg = 0;
        }

    }

}
