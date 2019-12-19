package com.ps.educational.service.service.Imp;

import com.ps.educational.data.bean.Course;
import com.ps.educational.data.bean.Student;
import com.ps.educational.data.dao.CourseMapper;
import com.ps.educational.service.service.CourseService;
import com.ps.educational.view.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseServiceImp implements CourseService {
    @Resource
    CourseMapper courseMapper;

    @Override
    public int deleteByPrimaryKey(Long courseid) {
        return courseMapper.deleteByPrimaryKey(courseid);
    }

    @Override
    public int insert(Course record) {
        return courseMapper.insert(record);
    }

    @Override
    public Course selectByPrimaryKey(Long courseid) {
        return courseMapper.selectByPrimaryKey(courseid);
    }

    @Override
    public List<Course> selectAll() {
        return courseMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Course record) {
        return courseMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageBean<Course> queryReturnBlogPage(int pageNo, int pageSize) {
        System.out.println("业务层实现分页：queryReturnBlogPage");
        PageBean<Course> pageBean = new PageBean<Course>();
        try {
            Map<String, Object> parms = new HashMap<String, Object>();
            //第一页：pageNo:1
            //每页2条记录:pageSize:2
            int start = (pageNo - 1) * pageSize + 1;
            int end = pageNo * pageSize;
            parms.put("startIndex", start);//每一页第一条记录编号
            parms.put("endIndex", end);//每一页最后一条记录编号
            List<Course> courses = courseMapper.selectByPage(parms);//分页查询
            int totalCount = courseMapper.getTotalCount();//记录总数
            pageBean.setData(courses);
            pageBean.setTotalRecords(totalCount);
            pageBean.setPageNo(pageNo);
            pageBean.setPageSize(pageSize);
            System.out.println("业务层返回的分页结果：" + pageBean.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return pageBean;
    }
}
