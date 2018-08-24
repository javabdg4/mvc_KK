package com.sda.mvc;

public class Student {
    private String name;
    private String lastName;
    private String indexNumber;

    public Student(String name, String lastName, String indexNumber) {
        this.name = name;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
}
