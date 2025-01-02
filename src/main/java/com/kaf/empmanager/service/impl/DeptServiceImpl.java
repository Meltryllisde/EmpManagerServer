package com.kaf.empmanager.service.impl;

import com.kaf.empmanager.mapper.DeptMapper;
import com.kaf.empmanager.pojo.Dept;
import com.kaf.empmanager.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> deptList() {
        return deptMapper.list();
    }
    @Override
    public boolean deptInsert(Dept dept) {
        if(deptMapper.selectByNumber(dept.getNumber()) > 0) {
            return false;
        }
        else {
            dept.setId(dept.getNumber());
            dept.setQuantity(0);
            deptMapper.insert(dept);
            return true;
        }
    }

    @Override
    public boolean deptUpdate(Dept dept) {
        if(deptMapper.selectByNumber(dept.getNumber())>0) {
            return false;
        }
        else {
            deptMapper.update(dept.getId(), dept.getNumber(),dept.getName());
            return true;
        }
    }

    @Override
    public boolean deptDeleteById(String id) {
        if(deptMapper.selectByNumber_for_delete(id) > 0) {
            return false;
        }
        deptMapper.deleteById(id);
        return true;
    }
}
