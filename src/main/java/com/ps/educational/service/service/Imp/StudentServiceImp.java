package com.ps.educational.service.service.Imp;

import com.ps.educational.data.bean.Student;
import com.ps.educational.data.dao.StudentMapper;
import com.ps.educational.service.service.StudentService;
import com.ps.educational.view.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImp implements StudentService {

    @Resource
    StudentMapper studentMapper;

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return studentMapper.deleteByPrimaryKey(userid);
    }

    @Override
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public Student selectByPrimaryKey(Integer userid) {
        return studentMapper.selectByPrimaryKey(userid);
    }

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Student> selectByCid(Integer collegeid) {
        return studentMapper.selectByCid(collegeid);
    }

    @Override
    public PageBean<Student> queryReturnBlogPage(int pageNo, int pageSize) {
        System.out.println("业务层实现分页：queryReturnBlogPage");
        PageBean<Student> pageBean = new PageBean<Student>();
        try {
            Map<String, Object> parms = new HashMap<String, Object>();
            //第一页：pageNo:1
            //每页2条记录:pageSize:2
            int start = (pageNo - 1) * pageSize + 1;
            int end = pageNo * pageSize;
            parms.put("startIndex", start);//每一页第一条记录编号
            parms.put("endIndex", end);//每一页最后一条记录编号
            List<Student> students = studentMapper.selectByPage(parms);//分页查询
            int totalCount = studentMapper.getTotalCount();//记录总数
            pageBean.setData(students);
            pageBean.setTotalRecords(totalCount);
            pageBean.setPageNo(pageNo);
            pageBean.setPageSize(pageSize);
            System.out.println("业务层返回的分页结果："+pageBean.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return pageBean;
    }


}
