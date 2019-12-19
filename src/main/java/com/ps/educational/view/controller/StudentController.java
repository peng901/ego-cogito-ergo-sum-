package com.ps.educational.view.controller;

import com.ps.educational.data.bean.Student;
import com.ps.educational.service.service.StudentService;
import com.ps.educational.view.util.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
public class StudentController {
    @Resource
    StudentService studentService;

    @RequestMapping(value = "queryStu.do",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> queryStuPages(PageBean page) {
        System.out.println("启动控制器分页：queryStuPages");
        System.out.println("传递的页号：" + page.getPageNo());
        System.out.println("传递的页大小：" + page.getPageSize());
        PageBean<Student> pageBeans = studentService.queryReturnBlogPage(page.getPageNo(), page.getPageSize());
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        System.out.println("控制器分页结果：" + pageBeans.toString());
        System.out.println("分页结果：" + pageBeans.getData().toString());
        paramsMap.put("list", pageBeans);
        return paramsMap;
    }

    //删除记录
    @RequestMapping(value="deleteStu.do",method = RequestMethod.POST)
    @ResponseBody
    public  boolean deleteStu(Integer userid){
        System.out.println("启动控制器删除deleteStu");
        System.out.println("删除主键："+userid);
        if (studentService.deleteByPrimaryKey(userid)>0){
            return true;
        }
        return false;
    }

    //新增记录
    @RequestMapping(value="addStu.do",method = RequestMethod.POST)
    @ResponseBody
    public  boolean addStu(Student student){
        System.out.println("启动控制器新增addStu");
        System.out.println(student.toString());
        if (studentService.insert(student)>0){
            return  true;
        }
            return false;
    }

    //修改记录
    @RequestMapping(value="updateStu.do",method = RequestMethod.POST)
    @ResponseBody
    public  boolean updateStu(Student student){
        System.out.println("启动控制器修改updateStu");
        System.out.println(student.toString());
        if (studentService.updateByPrimaryKey(student)>0){
            return  true;
        }
            return false;
    }
}
