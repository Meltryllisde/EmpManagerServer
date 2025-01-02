package com.kaf.empmanager.pojo;

import java.sql.Date;
import java.sql.Timestamp;

public class LeaveRequest {
    private Integer id;
    private Integer emp_id;
    private String leave_type;
    private Date start_date;
    private Date end_date;
    private Integer days;
    private String status;
    private Integer approver_id;
    private Date approval_date;
    private String remark;
    private Timestamp apply_date;
}
