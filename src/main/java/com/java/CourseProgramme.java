package org.example;

import java.util.ArrayList;
import org.joda.time.*;

public class CourseProgramme {

    private String courseName;
    private int courseId;
    private ArrayList<Module> moduleAvailable = new ArrayList<>();
    private ArrayList<Student> studentsEnrolled = new ArrayList<>();

    private DateTime startDate = new DateTime(2022,9,5,9,0);
    private DateTime finishDate = new DateTime(2023,5,16,0,0);

    public CourseProgramme() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public ArrayList<Module> getModuleAvailable() {
        return moduleAvailable;
    }

    public void setModuleAvailable(ArrayList<Module> moduleAvailable) {
        this.moduleAvailable = moduleAvailable;
    }

    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(ArrayList<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(DateTime finishDate) {
        this.finishDate = finishDate;
    }
}
