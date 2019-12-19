package com.ps.educational.service.service;

import com.ps.educational.data.bean.Student;
import com.ps.educational.view.util.PageBean;

import java.util.List;

public interface StudentService {
    int deleteByPrimaryKey(Integer userid);

    int insert(Student record);

    Student selectByPrimaryKey(Integer userid);

    List<Student> selectAll();

    int updateByPrimaryKey(Student record);

    /**
     * 根据学院ID查询所有学生
     * @param collegeid
     * @return
     */
    List<Student> selectByCid(Integer collegeid);

    /**
     * 分页查询消息
     * @param
     * @return
     */
    PageBean<Student> queryReturnBlogPage(int pageNo, int pageSize);
}
