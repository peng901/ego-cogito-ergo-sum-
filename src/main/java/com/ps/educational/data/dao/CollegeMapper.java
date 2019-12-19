package com.ps.educational.data.dao;

import com.ps.educational.data.bean.College;
import java.util.List;

public interface CollegeMapper {
    int deleteByPrimaryKey(Integer collegeid);

    int insert(College record);

    College selectByPrimaryKey(Integer collegeid);

    List<College> selectAll();

    int updateByPrimaryKey(College record);
}