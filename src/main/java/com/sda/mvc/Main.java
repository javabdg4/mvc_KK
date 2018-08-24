package com.sda.mvc;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jan", "Kowalski", "124768");

        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(studentView, student);

studentController.updateView();
studentController.setStudentName("nowe imie");
studentController.updateView();
    }
}
