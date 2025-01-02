package com.kaf.empmanager.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;
import java.sql.Timestamp;

public class Employee {
    private String id;
    private String number;
    private String name;
    private String sex;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String departmentName;
    private String type;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp entryDate;
    private String phone;
    private String address;
    private String idNumber;
    private String education;
    private String marriage;
    private String workStatus;
    private String password;
    public Employee() {
    }
    public Employee(String id, String number, String name, String sex, Date birthday, String departmentName, String type, Timestamp entryDate, String phone, String address, String idNumber, String education, String marriage, String workStatus, String password) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.departmentName = departmentName;
        this.type = type;
        this.entryDate = entryDate;
        this.phone = phone;
        this.address = address;
        this.idNumber = idNumber;
        this.education = education;
        this.marriage = marriage;
        this.workStatus = workStatus;
        this.password = password;
    }

    public Employee(String number) {
        this.number = number;
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

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setentryDate(Timestamp entryDate) {
        this.entryDate = entryDate;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    public void setpassword(String password) {
        this.password = password;
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

    public String getSex() {
        return sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getType() {
        return type;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Timestamp getentryDate() {
        return entryDate;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getEducation() {
        return education;
    }

    public String getMarriage() {
        return marriage;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public String getpassword() {
        return password;
    }
}
