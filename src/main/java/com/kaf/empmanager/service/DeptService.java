package com.kaf.empmanager.service;

import com.kaf.empmanager.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> deptList();
    boolean deptInsert(Dept dept);
    boolean deptUpdate(Dept dept);
    boolean deptDeleteById(String id);
}
