package com.ps.educational.data.dao;

import com.ps.educational.data.bean.Student;
import java.util.List;
import java.util.Map;

public interface StudentMapper {
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

    //查询记录总数
    public int getTotalCount();

    //根据页数计算当前页的全部记录
    //MyBatis为传递多个参数，必须使用HashMap
    public List<Student> selectByPage(Map<String, Object> param);
}