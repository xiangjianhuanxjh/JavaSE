package com.student;

public class StudentDegree {
    public void issueDegree(Manageable manage){
        double a = 0;
        try {
            a = manage.computeAverage();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        manage.getPass();
        manage.printInfo();
        System.out.println(a);
    }
}
