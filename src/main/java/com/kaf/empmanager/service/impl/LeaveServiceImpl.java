package com.kaf.empmanager.service.impl;

import com.kaf.empmanager.mapper.EmpMapper;
import com.kaf.empmanager.mapper.LeaveMapper;
import com.kaf.empmanager.pojo.Employee;
import com.kaf.empmanager.pojo.Leave;
import com.kaf.empmanager.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LeaveServiceImpl implements LeaveService {
    @Autowired
    private LeaveMapper leaveMapper;
    @Autowired
    private EmpMapper empMapper;

    @Override
    public void leaveInsert(Leave leave) {
        String id = UUID.randomUUID().toString();
        leave.setStatus("0");
        leaveMapper.insert(id,
                leave.getBeginTime(),
                leave.getEndTime(),
                leave.getReason(),
                leave.getApplyNumber(),
                leave.getDuration(),
                leave.getTypeID(),
                leave.getStatus(),
                leave.getApprovalName(),
                leave.getApplyTime());
    }

    @Override
    public List<Leave> leaveList(String number) {
        List<Leave>leaveList = leaveMapper.list(number);
        for(Leave item : leaveList){
            if(item.getStatus().equals("1") || item.getStatus().equals("2")){
                Employee employee = empMapper.findByNumber(item.getApprovalID());
                item.setApprovalName(employee.getName());
            }
        }
        return leaveList;
    }
}
