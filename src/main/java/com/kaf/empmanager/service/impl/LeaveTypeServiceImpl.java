package com.kaf.empmanager.service.impl;

import com.kaf.empmanager.mapper.LeaveTypeMapper;
import com.kaf.empmanager.pojo.LeaveType;
import com.kaf.empmanager.service.LeaveTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveTypeServiceImpl implements LeaveTypeService {
    @Autowired
    LeaveTypeMapper leaveTypeMapper;
    @Override
    public List<LeaveType> list() {

        return leaveTypeMapper.list();
    }
}
