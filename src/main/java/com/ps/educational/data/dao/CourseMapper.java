package com.ps.educational.data.dao;

import com.ps.educational.data.bean.Course;
import com.ps.educational.data.bean.Student;

import java.util.List;
import java.util.Map;

public interface CourseMapper {
    int deleteByPrimaryKey(Long courseid);

    int insert(Course record);

    Course selectByPrimaryKey(Long courseid);

    List<Course> selectAll();

    int updateByPrimaryKey(Course record);

    //查询记录总数
    public int getTotalCount();

    //根据页数计算当前页的全部记录
    //MyBatis为传递多个参数，必须使用HashMap
    public List<Course> selectByPage(Map<String, Object> param);
}