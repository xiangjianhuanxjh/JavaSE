package com.student;

public abstract class Student{
    private String name;   //姓名
    private char gender;   //性别
    private String birthDay; //出生日期
    private String school; //学校
    private String stuId;  //学号
    private String category;//学生类别
    private double[] score; //课程成绩
    private boolean status; //学位颁发状态
    public abstract String getDegree();


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public String getStuId() {
        return stuId;
    }
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public double[] getScore() {
        return score;
    }
    public void setScore(double[] score) {
        this.score = score;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}