package com.kaf.empmanager.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Leave {
    private String id;
    private String applyNumber;
    private String applyName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp beginTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp endTime;
    private String duration;
    private String reason;
    private String typeID;
    private String status;
    private String approvalID;
    private String taskTypeID;
    private String date1;
    private String date2;
    private String date3;
    private String date4;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp applyTime;
    private String statusName;
    private String approvalName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp approvalTime;
    private String typeName;
    private String approvalNumber;
    private String advice;
    public Leave() {
    }

    public Leave(String id, String advice, String approvalNumber, Timestamp approvalTime) {
        this.id = id;
        this.advice = advice;
        this.approvalNumber = approvalNumber;
        this.approvalTime = approvalTime;
    }

    public Leave(String applyNumber) {
        this.applyNumber = applyNumber;
    }

    public Leave(String applyNumber, String applyName, Timestamp beginTime, Timestamp endTime, String duration, String reason, String typeID, String status, String approvalID, String taskTypeID, String date1, String date2, String date3, String date4, Timestamp applyTime, String statusName, String approvalName, Timestamp approvalTime, String typeName) {
        this.applyNumber = applyNumber;
        this.applyName = applyName;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.duration = duration;
        this.reason = reason;
        this.typeID = typeID;
        this.status = status;
        this.approvalID = approvalID;
        this.taskTypeID = taskTypeID;
        this.date1 = date1;
        this.date2 = date2;
        this.date3 = date3;
        this.date4 = date4;
        this.applyTime = applyTime;
        this.statusName = statusName;
        this.approvalName = approvalName;
        this.approvalTime = approvalTime;
        this.typeName = typeName;
    }

    public Leave(String id, Timestamp endTime, Timestamp beginTime, String reason, String applyNumber, String duration, String typeID, String typeName, String status, String approvalID, Timestamp applyTime, Timestamp approvalTime) {
        this.id = id;
        this.endTime = endTime;
        this.beginTime = beginTime;
        this.reason = reason;
        this.applyNumber = applyNumber;
        this.duration = duration;
        this.typeID = typeID;
        this.typeName = typeName;
        this.status = status;
        this.approvalID = approvalID;
        this.applyTime = applyTime;
        this.approvalTime = approvalTime;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public void setBeginTime(Timestamp beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setApprovalID(String approvalID) {
        this.approvalID = approvalID;
    }

    public void setTaskTypeID(String taskTypeID) {
        this.taskTypeID = taskTypeID;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public void setDate3(String date3) {
        this.date3 = date3;
    }

    public void setDate4(String date4) {
        this.date4 = date4;
    }

    public void setApplyTime(Timestamp applyTime) {
        this.applyTime = applyTime;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public void setApprovalName(String approvalName) {
        this.approvalName = approvalName;
    }

    public void setApprovalTime(Timestamp approvalTime) {
        this.approvalTime = approvalTime;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getApplyNumber() {
        return applyNumber;
    }

    public String getApplyName() {
        return applyName;
    }

    public Timestamp getBeginTime() {
        return beginTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public String getDuration() {
        return duration;
    }

    public String getReason() {
        return reason;
    }

    public String getTypeID() {
        return typeID;
    }

    public String getStatus() {
        return status;
    }

    public String getApprovalID() {
        return approvalID;
    }

    public String getTaskTypeID() {
        return taskTypeID;
    }

    public String getDate1() {
        return date1;
    }

    public String getDate2() {
        return date2;
    }

    public String getDate3() {
        return date3;
    }

    public String getDate4() {
        return date4;
    }

    public Timestamp getApplyTime() {
        return applyTime;
    }

    public String getStatusName() {
        return statusName;
    }

    public String getApprovalName() {
        return approvalName;
    }

    public Timestamp getApprovalTime() {
        return approvalTime;
    }

    public String getTypeName() {
        return typeName;
    }
}
