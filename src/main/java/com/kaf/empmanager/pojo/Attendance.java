package com.kaf.empmanager.pojo;

public class Attendance {
    private String attendanceOffStatus;
    private String attendanceOffTime;
    private String attendanceOnStatus;
    private String attendanceOnTime;
    private String date;
    private String id;
    private String remark;
    private String time;
    private String employeeID;

    public String getAttendanceOffStatus() {
        return attendanceOffStatus;
    }

    public void setAttendanceOffStatus(String attendanceOffStatus) {
        this.attendanceOffStatus = attendanceOffStatus;
    }

    public String getAttendanceOffTime() {
        return attendanceOffTime;
    }

    public void setAttendanceOffTime(String attendanceOffTime) {
        this.attendanceOffTime = attendanceOffTime;
    }

    public String getAttendanceOnStatus() {
        return attendanceOnStatus;
    }

    public void setAttendanceOnStatus(String attendanceOnStatus) {
        this.attendanceOnStatus = attendanceOnStatus;
    }

    public String getAttendanceOnTime() {
        return attendanceOnTime;
    }

    public void setAttendanceOnTime(String attendanceOnTime) {
        this.attendanceOnTime = attendanceOnTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
}
