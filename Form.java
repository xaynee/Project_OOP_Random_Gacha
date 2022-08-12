package com.ProjectOOP;

public class Form {
    private String nama;
    private int password;
    private boolean isRobot;

    public Form(String name, int password) {
        this.nama = name;
        this.password = password;
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

}
