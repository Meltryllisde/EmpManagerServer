package com.kaf.empmanager.service;

import com.kaf.empmanager.pojo.Employee;

import java.util.List;

public interface EmpService {
    List<Employee> empList();
    boolean empInsert(Employee employee);
    void empUpdate(Employee employee);
    void empDeleteById(String id);
    Employee empFindByNumber(String number);
    List<Employee> empFindByNameAndDepartment(String name, String department);
    void empUpdatePassword(String number, String password);
}
