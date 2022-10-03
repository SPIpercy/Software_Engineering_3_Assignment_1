package org.example;

import java.util.ArrayList;

public class Lecturer {

    private String name,DOB;
    private int age;
    private double id;
    private ArrayList<CourseProgramme> coursesTaught = new ArrayList<>();

    public Lecturer() {

    }

    public Lecturer(String name, String DOB, int age, double id, ArrayList<CourseProgramme> coursesTaught) {
        this.name = name;
        this.DOB = DOB;
        this.age = age;
        this.id = id;
        this.coursesTaught = coursesTaught;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {

        return getName().replaceAll("\\s","")+getAge();
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public ArrayList<CourseProgramme> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(ArrayList<CourseProgramme> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
}
