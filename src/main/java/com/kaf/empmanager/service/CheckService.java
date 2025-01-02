package com.kaf.empmanager.service;

import com.kaf.empmanager.pojo.Check;

import java.util.List;

public interface CheckService {
    Check getCheckInfo(Check check);
    List<Check> getCheckInfoByNumber(Check check);
}
