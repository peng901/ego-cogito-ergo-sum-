package com.ps.educational.service.service;

import com.ps.educational.data.bean.Userlogin;

import java.util.List;

public interface UserloginService {
    int deleteByPrimaryKey(Integer userid);

    int insert(Userlogin record);

    Userlogin selectByPrimaryKey(Integer userid);

    List<Userlogin> selectAll();

    int updateByPrimaryKey(Userlogin record);

    Userlogin login(Userlogin user);
}
