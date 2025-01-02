package com.kaf.empmanager.mapper;

import com.kaf.empmanager.pojo.Leave;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface TaskMapper {
    @Select("select empmanager.`leave`.id as id,empmanager.`leave`.begin_time as beginTime,empmanager.`leave`.end_time as endTime,empmanager.`leave`.reason as reason,empmanager.`leave`.applicant_id as applyNumber,empmanager.`leave`.duration as duration,empmanager.`leave`.type_id,empmanager.`leave_type`.name as typeName,empmanager.`leave`.status as status,empmanager.`leave`.approver as approvalID,empmanager.`leave`.apply_time as applyTime, empmanager.`leave`.approval_time as approvalTime from empmanager.`leave`, empmanager.leave_type where status = '0' and empmanager.leave_type.id = empmanager.`leave`.type_id order by empmanager.`leave`.apply_time desc")
    List<Leave> list();

    @Select("select empmanager.`leave`.id as id,empmanager.`leave`.begin_time as beginTime,empmanager.`leave`.end_time as endTime,empmanager.`leave`.reason as reason,empmanager.`leave`.applicant_id as applyNumber,empmanager.`leave`.duration as duration,empmanager.`leave`.type_id,empmanager.`leave_type`.name as typeName,empmanager.`leave`.status as status,empmanager.`leave`.approver as approvalID,empmanager.`leave`.apply_time as applyTime, empmanager.`leave`.approval_time as approvalTime from empmanager.`leave`, empmanager.leave_type where empmanager.`leave`.id = #{id} and empmanager.leave_type.id = empmanager.`leave`.type_id order by empmanager.`leave`.apply_time desc")
    Leave findByApplyID(@Param("id") String id);

    @Update("update empmanager.`leave` set approver = #{approvalNumber},approval_time = #{approvalTime},status = #{advice} where id = #{id}")
    void approval(@Param("id") String id,
                    @Param("advice") String advice,
                    @Param("approvalNumber") String approvalNumber,
                    @Param("approvalTime") Timestamp approvalTime);
}
