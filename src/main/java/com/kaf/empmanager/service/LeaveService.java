package com.kaf.empmanager.service;

import com.kaf.empmanager.pojo.Leave;

import java.util.List;

public interface LeaveService {
    void leaveInsert(Leave leave);
    List<Leave> leaveList(String number);
}
