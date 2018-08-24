package com.sda.mvc;

public class StudentView {

    public void printStudent(Student student){
        System.out.println(student.getName()+ " "+ student.getLastName()+ " "+ student.getIndexNumber());
    }
}
