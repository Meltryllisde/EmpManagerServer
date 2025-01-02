package com.kaf.empmanager.service.impl;

import com.kaf.empmanager.mapper.EmpMapper;
import com.kaf.empmanager.pojo.Employee;
import com.kaf.empmanager.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Employee> empList() {
        return empMapper.list();
    }

    @Override
    public boolean empInsert(Employee employee) {
        employee.setId(UUID.randomUUID().toString());
        employee.setpassword("123123");
        employee.setWorkStatus("0");
//        String deptid = empMapper.select_for_insert_dept_name2id(employee.getDepartmentName());

        if(empMapper.select_for_insert_count(employee.getNumber()) > 0) {
            return false;
        }
        empMapper.insert(employee.getId(),
                         employee.getNumber(),
                         employee.getName(),
                         employee.getSex(),
                         employee.getBirthday(),
                         employee.getDepartmentName(),
                         employee.getType(),
                         employee.getentryDate(),
                         employee.getPhone(),
                         employee.getAddress(),
                         employee.getIdNumber(),
                         employee.getEducation(),
                         employee.getMarriage(),
                         employee.getWorkStatus()
                        );
        return true;
    }
    @Override
    public void empUpdate(Employee employee) {
        String depid = empMapper.select_for_insert_dept_name2id(employee.getDepartmentName());
        employee.setDepartmentName(depid);
        empMapper.update(employee);
    }
    @Override
    public void empDeleteById(String id) {
        empMapper.deleteById(id);
    }
    @Override
    public Employee empFindByNumber(String number) {
        return empMapper.findByNumber(number);
    }
    @Override
    public List<Employee> empFindByNameAndDepartment(String name, String department) {
        if(name.equals("") && department.equals("")) {
            return empMapper.list();
        }
        if(name.equals("") && !department.equals("")) {
            return empMapper.empFindByDepartment(department);
        }
        if(!name.equals("") && department.equals("")) {
            return empMapper.empFindByName(name);
        }
        if(name!=null && department!=null) {
            return empMapper.empFindByNameAndDepartment(name, department);
        }
        return null;
    }

    @Override
    public void empUpdatePassword(String number, String password) {
        empMapper.updatePassword(number, password);
    }
}
