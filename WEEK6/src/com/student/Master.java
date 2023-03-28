package com.student;

import java.util.Arrays;

public class Master extends Student implements Manageable{
    private double aver;
    private char thesisLevel;

    public double getAver() {
        return aver;
    }
    public void setAver(double aver) {
        this.aver = aver;
    }
    public char getThesisLevel() {
        return thesisLevel;
    }
    public void setThesisLevel(char thesisLevel) {
        this.thesisLevel = thesisLevel;
    }
    public double computeAverage() throws Exception{
        aver = 1;
        int i;
        for(i=0;i<getScore().length;i++){
            try{
                if(getScore()[i]<0||getScore()[i]>100) {
                    throw new MasterException(getScore()[i]+"此课程分数不在0-100以内");
                }
                else aver = getScore()[i] * aver;
            }
            catch (MasterException e){
                System.out.println(e.warnMess());
            }
        }
        aver = Math.pow(aver,(double)1/i);
        try{
            if(thesisLevel<65 || thesisLevel>69){
                throw new MasterException(thesisLevel+"该学位论文等级不在A-E范围内");
            }
        }
        catch (MasterException e){
            System.out.println(e.warnMess());
        }
        return aver;
    }
    public boolean getPass() {
        boolean a = false;
        if(aver>=80 && (thesisLevel =='A'||thesisLevel =='B'||thesisLevel =='C')) {
            a= true;
        }
        setStatus(a);
        return a;
    }
    public String getDegree() {
        String str = Constants.UNSATISFACTORY_ISSUE_MASTER_DEGREE;
        if(isStatus()) {
            str = Constants.ISSUE_MASTER_DEGREE;
        }
        return str;
    }
    public void printInfo() {
        System.out.println(getName()+','+getGender()+','+getBirthDay()+','+getSchool()+','+getStuId()+
                ','+getCategory()+','+ Arrays.toString(getScore())+','+getThesisLevel()+','+getDegree());
    }
}
