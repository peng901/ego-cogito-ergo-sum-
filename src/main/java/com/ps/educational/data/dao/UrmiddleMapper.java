package com.ps.educational.data.dao;

import com.ps.educational.data.bean.Urmiddle;
import java.util.List;

public interface UrmiddleMapper {
    int deleteByPrimaryKey(Integer urid);

    int insert(Urmiddle record);

    Urmiddle selectByPrimaryKey(Integer userid);

    List<Urmiddle> selectAll();

    int updateByPrimaryKey(Urmiddle record);
}