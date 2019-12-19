package com.ps.educational.data.dao;

import com.ps.educational.data.bean.Teacher;
import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(Long userid);

    int insert(Teacher record);

    Teacher selectByPrimaryKey(Long userid);

    List<Teacher> selectAll();

    int updateByPrimaryKey(Teacher record);
}