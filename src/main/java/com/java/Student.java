package org.example;

import java.util.ArrayList;

public class Student {

    private String name,DOB;
    private int age;
    private double id;
    private ArrayList<Module> modules= new ArrayList<>();

    private CourseProgramme course;
    public Student(){

    }

    public Student(String name, String DOB, int age, double id, ArrayList<Module> modules, CourseProgramme course) {
        this.name = name;
        this.DOB = DOB;
        this.age = age;
        this.id = id;
        this.modules = modules;
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourses(CourseProgramme course) {
        this.course = course;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(double id) {
        this.id = id;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public String getName() {
        return name;
    }

    public CourseProgramme getCourse() {
        return course;
    }

    public String getUsername() {

        return getName().replaceAll("\\s","")+getAge();
    }

    public String getDOB() {
        return DOB;
    }

    public int getAge() {
        return age;
    }

    public double getId() {
        return id;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

}
