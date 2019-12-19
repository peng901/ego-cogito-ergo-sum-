package com.ps.educational.data.dao;

import com.ps.educational.data.bean.Role;
import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer roleid);

    int insert(Role record);

    Role selectByPrimaryKey(Integer roleid);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);

    List<Role> selectByUid();
}