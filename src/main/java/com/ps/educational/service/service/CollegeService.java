package com.ps.educational.service.service;

import com.ps.educational.data.bean.College;

import java.util.List;

public interface CollegeService {
    int deleteByPrimaryKey(Integer collegeid);

    int insert(College record);

    College selectByPrimaryKey(Integer collegeid);

    List<College> selectAll();

    int updateByPrimaryKey(College record);
}
