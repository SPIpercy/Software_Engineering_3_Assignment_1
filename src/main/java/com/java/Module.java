package org.example;

import java.util.ArrayList;

public class Module {

    private String moduleName;
    private double ModuleId;
    private ArrayList<Student> noOfStudents= new ArrayList<>();
    private ArrayList<CourseProgramme> associatedCourses= new ArrayList<>();
    private Lecturer lecturerResponsible;

    public Module() {
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public double getModuleId() {
        return ModuleId;
    }

    public void setModuleId(double moduleId) {
        ModuleId = moduleId;
    }

    public ArrayList<Student> getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(ArrayList<Student> noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public ArrayList<CourseProgramme> getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(ArrayList<CourseProgramme> associatedCourses) {
        this.associatedCourses = associatedCourses;
    }

    public Lecturer getLecturerResponsible() {
        return lecturerResponsible;
    }

    public void setLecturerResponsible(Lecturer lecturerResponsible) {
        this.lecturerResponsible = lecturerResponsible;
    }
}
