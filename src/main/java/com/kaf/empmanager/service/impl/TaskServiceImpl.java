package com.kaf.empmanager.service.impl;

import com.kaf.empmanager.mapper.EmpMapper;
import com.kaf.empmanager.mapper.TaskMapper;
import com.kaf.empmanager.pojo.Employee;
import com.kaf.empmanager.pojo.Leave;
import com.kaf.empmanager.service.TaskService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskMapper taskMapper;
    @Autowired
    EmpMapper empMapper;
    @Override
    public List<Leave> leaveList() {
        List<Leave>leaveList = taskMapper.list();
        for(Leave item : leaveList){
            if(item.getStatus().equals("1") || item.getStatus().equals("2")){
                Employee employee = empMapper.findByNumber(item.getApprovalID());
                item.setApprovalName(employee.getName());
                item.setStatusName("1".equals(item.getStatus()) ? "通过" : "驳回");
            }
            else {
                item.setStatusName("待审批");
            }
            item.setTaskTypeID("1");
            Employee employee = empMapper.findByNumber(item.getApplyNumber());
            item.setApplyName(employee.getName());
        }
        return leaveList;
    }
    @Override
    public Leave findByApplyID(String id) {
        Leave leave = taskMapper.findByApplyID(id);
        if(leave.getStatus().equals("0")) {
            leave.setStatusName("待审批");
        }
        else if(leave.getStatus().equals("1")) {
            leave.setStatusName("通过");
        }
        else {
            leave.setStatusName("驳回");
        }
        Employee employee = empMapper.findByNumber(leave.getApplyNumber());
        leave.setApplyName(employee.getName());
        return leave;
    }
    @Override
    public void approval(Leave leave) {
        String id = leave.getId();
        String advice = leave.getAdvice();
        String approvalNumber = leave.getApprovalNumber();
        Timestamp approvalTime = leave.getApprovalTime();
        advice = "yes".equals(advice) ? "1" : "2";
        taskMapper.approval(id, advice, approvalNumber, approvalTime);
    }
}
