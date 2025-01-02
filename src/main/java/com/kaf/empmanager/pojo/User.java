package com.kaf.empmanager.pojo;

public class User {
    private String number;
    private String password;

    public String getNumber() {
        return number;
    }

    public String getPassword() {
        return password;
    }

    public User(String number, String password) {
        this.number = number;
        this.password = password;
    }
}
