package com.student;

import java.util.Arrays;

public class Undergraduate extends Student implements Manageable{
    private double aver;
    public double getAver() {
        return aver;
    }
    public void setAver(double aver) {
        this.aver = aver;
    }

    public double computeAverage() throws Exception {
        aver = 0;
        for(int i=0;i<getScore().length;i++){
            try{
                if(getScore()[i]<0||getScore()[i]>100) {
                    throw new UndergraduateException(getScore()[i]+"此课程分数不在0-100以内");
                }
                else aver = getScore()[i] + aver;
            }
            catch (UndergraduateException e){
                System.out.println(e.warnMess());
            }
        }
        aver = aver/getScore().length;
        return aver;
    }
    public boolean getPass() {
        boolean a = false;
        if(aver>=60) {
            a = true;
        }
        setStatus(a);
        return a;
    }
    public String getDegree() {
        String str = Constants.UNSATISFACTORY_ISSUE_UNDERGRADUATE_DEGREE;
        if(isStatus()) {
            str = Constants.ISSUE_UNDERGRADUATE_DEGREE;
        }
        return str;
    }
    public void printInfo() {
        System.out.println(getName()+','+getGender()+','+getBirthDay()+
                ','+getSchool()+','+getStuId()+','+getCategory()+','+ Arrays.toString(getScore())+','+getDegree());
    }
}