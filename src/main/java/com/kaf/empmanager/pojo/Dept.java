package com.kaf.empmanager.pojo;

public class Dept {
    private String id;
    private String number;
    private String name;
    private Integer quantity;

    public Dept(String id, String number, String name, Integer quantity) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
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

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
