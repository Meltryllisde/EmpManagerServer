package com.kaf.empmanager.service.impl;

import com.kaf.empmanager.config.MyConst;
import com.kaf.empmanager.mapper.AttendanceMapper;
import com.kaf.empmanager.pojo.Attendance;
import com.kaf.empmanager.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Service
public class AttendanceServiceImpl implements AttendanceService {
    @Autowired
    private MyConst myConst;
    @Autowired
    private AttendanceMapper attendanceMapper;
    @Override
    public int getAttendanceOn(Attendance attendance) {
        String employeeId = attendance.getEmployeeID();

        Timestamp attendanceOnTime = Timestamp.valueOf(attendance.getAttendanceOnTime());
        Date date = new Date(attendanceOnTime.getTime());

        int count1 = attendanceMapper.select_for_on_leave(employeeId, date.toString());
        if(count1 > 0) return 2;
        int count2 = attendanceMapper.select_for_on(employeeId, date.toString());
        if(count2 == 0) {
            return 0;
        }
        if(count2 == 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public int getAttendanceOff(Attendance attendance) {
        String employeeId = attendance.getEmployeeID();

        Timestamp attendanceOffTime = Timestamp.valueOf(attendance.getAttendanceOffTime());
        Date date = new Date(attendanceOffTime.getTime());

        int count = attendanceMapper.select_for_off(employeeId, date.toString());
        if(count == 0) {
            return 0;
        }
        if(count == 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public void AttendanceOn(Attendance attendance) {
        String OnTime = myConst.getOnTime();
        String employeeId = attendance.getEmployeeID();
        String id = UUID.randomUUID().toString();
        String status = null;
        Timestamp attendanceOnTime = Timestamp.valueOf(attendance.getAttendanceOnTime());
        Date date = new Date(attendanceOnTime.getTime());

        LocalTime timeFromTimestamp = attendanceOnTime.toLocalDateTime().toLocalTime();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime specifiedTime = LocalTime.parse(OnTime, timeFormatter);

        if(timeFromTimestamp.isAfter(specifiedTime)) {
            status = "迟到";
        } else {
            status = "正常";
        }
        attendanceMapper.insertOn(id, employeeId, date.toString(), attendanceOnTime, status);
    }

    @Override
    public void AttendanceOff(Attendance attendance) {
        String OffTime = myConst.getOffTime();
        String employeeId = attendance.getEmployeeID();
        String id = UUID.randomUUID().toString();
        String status = null;
        Timestamp attendanceOffTime = Timestamp.valueOf(attendance.getAttendanceOffTime());
        Date date = new Date(attendanceOffTime.getTime());

        LocalTime timeFromTimestamp = attendanceOffTime.toLocalDateTime().toLocalTime();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime specifiedTime = LocalTime.parse(OffTime, timeFormatter);

        if(timeFromTimestamp.isBefore(specifiedTime)) {
            status = "早退";
        } else {
            status = "正常";
        }
        attendanceMapper.updateOff(employeeId, date.toString(), attendanceOffTime, status);
    }
}
