package com.ps.educational.service.service;

import com.ps.educational.data.bean.Course;
import com.ps.educational.data.bean.Student;
import com.ps.educational.view.util.PageBean;

import java.util.List;

public interface CourseService {
    int deleteByPrimaryKey(Long courseid);

    int insert(Course record);

    Course selectByPrimaryKey(Long courseid);

    List<Course> selectAll();

    int updateByPrimaryKey(Course record);

    /**
     * 分页查询消息
     * @param
     * @return
     */
    PageBean<Course> queryReturnBlogPage(int pageNo, int pageSize);
}
