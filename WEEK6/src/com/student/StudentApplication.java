package com.student;

public class StudentApplication {
    public static void main(String[] args) {
        Student student1;  //undergraduate
        Student student2;  //master
        double[] score1={89.5,82,87,73};
        double[] score2={70,52.5,95,88,89,91};
        Undergraduate undergraduate = new Undergraduate();
        undergraduate.setName("王小二");
        undergraduate.setGender('男');
        undergraduate.setBirthDay("2001-6-1");
        undergraduate.setSchool("上海大学");
        undergraduate.setStuId("11128981");
        undergraduate.setCategory("大学本科生");
        undergraduate.setScore(score1);
        undergraduate.setStatus(false);

        Master master = new Master();
        master.setName("李燕");
        master.setGender('女');
        master.setBirthDay("1996-6-12");
        master.setSchool("上海大学");
        master.setStuId("10306");
        master.setCategory("硕士研究生");
        master.setScore(score2);
        master.setThesisLevel('B');
        master.setStatus(false);

        StudentDegree studentDegree = new StudentDegree();
        studentDegree.issueDegree(undergraduate);

        studentDegree.issueDegree(master);

    }
}

