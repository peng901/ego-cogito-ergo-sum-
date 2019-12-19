package com.ps.educational.data.dao;

import com.ps.educational.data.bean.Rpmiddle;
import java.util.List;

public interface RpmiddleMapper {
    int deleteByPrimaryKey(Long rpid);

    int insert(Rpmiddle record);

    Rpmiddle selectByPrimaryKey(Long rpid);

    List<Rpmiddle> selectAll();

    int updateByPrimaryKey(Rpmiddle record);
}