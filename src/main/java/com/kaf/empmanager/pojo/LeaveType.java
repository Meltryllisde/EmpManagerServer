package com.kaf.empmanager.pojo;

public class LeaveType {
    String id;
    String number;
    String name;

    public LeaveType(String id, String name, String number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }
}
