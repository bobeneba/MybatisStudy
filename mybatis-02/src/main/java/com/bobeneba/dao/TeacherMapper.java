package com.bobeneba.dao;

import com.bobeneba.pojo.Teacher;
import com.bobeneba.pojo.TeacherA;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    @Select("select * from teacher where id =#{tid} ")
    Teacher getTeacher(@Param("tid") int id);

    List<TeacherA> getTeacherA();

    TeacherA getTeacherB(@Param("tid") int id);



}
