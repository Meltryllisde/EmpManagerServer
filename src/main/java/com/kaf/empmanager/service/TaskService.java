package com.kaf.empmanager.service;

import com.kaf.empmanager.pojo.Leave;

import java.util.List;

public interface TaskService {
    List<Leave> leaveList();
    Leave findByApplyID(String id);
    void approval(Leave leave);
}
