package com.ps.educational.data.dao;

import com.ps.educational.data.bean.Selectedcourse;
import java.util.List;

public interface SelectedcourseMapper {
    int insert(Selectedcourse record);

    List<Selectedcourse> selectAll();
}