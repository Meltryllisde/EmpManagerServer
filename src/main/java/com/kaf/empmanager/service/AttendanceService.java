package com.kaf.empmanager.service;

import com.kaf.empmanager.pojo.Attendance;

public interface AttendanceService {
    int getAttendanceOn(Attendance attendance);
    int getAttendanceOff(Attendance attendance);
    void AttendanceOn(Attendance attendance);
    void AttendanceOff(Attendance attendance);
}
