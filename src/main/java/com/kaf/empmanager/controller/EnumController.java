package com.kaf.empmanager.controller;

import com.kaf.empmanager.config.MyConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enum")
public class EnumController {
    @Autowired
    private MyConst myConst;
    @RequestMapping("/getAttendanceTime")
    public String getAttendanceTime() {
        return myConst.getOnTime() + "-" + myConst.getOffTime();
    }
}
