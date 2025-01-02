package com.kaf.empmanager.mapper;

import com.kaf.empmanager.pojo.Leave;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface LeaveMapper {
    @Insert("insert into empmanager.`leave` (id, begin_time, end_time, reason, applicant_id, duration, type_id, status, approver, apply_time) values (#{id}, #{beginTime}, #{endTime}, #{reason}, #{applyNumber}, #{duration}, #{typeId}, #{status}, #{approvalName}, #{applyTime})")
    void insert(@Param("id") String id,
                @Param("beginTime") Timestamp beginTime,
                @Param("endTime") Timestamp endTime,
                @Param("reason") String reason,
                @Param("applyNumber") String applyNumber,
                @Param("duration") String duration,
                @Param("typeId") String typeId,
                @Param("status") String status,
                @Param("approvalName") String approvalName,
                @Param("applyTime") Timestamp applyTime);

    @Select("select empmanager.`leave`.id as id,empmanager.`leave`.begin_time as beginTime,empmanager.`leave`.end_time as endTime,empmanager.`leave`.reason as reason,empmanager.`leave`.applicant_id as applyNumber,empmanager.`leave`.duration as duration,empmanager.`leave`.type_id,empmanager.`leave_type`.name as typeName,empmanager.`leave`.status as status,empmanager.`leave`.approver as approvalID,empmanager.`leave`.apply_time as applyTime, empmanager.`leave`.approval_time as approvalTime from empmanager.`leave`, empmanager.leave_type where applicant_id = #{number} and empmanager.leave_type.id = empmanager.`leave`.type_id order by empmanager.`leave`.apply_time desc")
    List<Leave> list(@Param("number") String number);
}
