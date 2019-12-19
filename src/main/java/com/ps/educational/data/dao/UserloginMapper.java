package com.ps.educational.data.dao;

import com.ps.educational.data.bean.Userlogin;
import java.util.List;

public interface UserloginMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Userlogin record);

    Userlogin selectByPrimaryKey(Integer userid);

    List<Userlogin> selectAll();

    int updateByPrimaryKey(Userlogin record);

    Userlogin login(Userlogin user);
}