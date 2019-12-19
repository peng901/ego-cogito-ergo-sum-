package com.ps.educational.data.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Student {
    private Integer userid;

    private String username;

    private String sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthyear;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date grade;

    private Integer collegeid;

    private College college;

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(Date birthyear) {
        this.birthyear = birthyear;
    }

    public Date getGrade() {
        return grade;
    }

    public void setGrade(Date grade) {
        this.grade = grade;
    }

    public Integer getCollegeid() {
        return collegeid;
    }

    public void setCollegeid(Integer collegeid) {
        this.collegeid = collegeid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", birthyear=" + birthyear +
                ", grade=" + grade +
                ", collegeid=" + collegeid +
                ", college=" + college +
                '}';
    }
}