package com.java;

import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {

    private Lecturer lecturer1 = new Lecturer("Daniel Radcliff", new LocalDate(1985,7,12),1);
    private Student lecturer2 = new Student("Michael Bacon", new LocalDate(1843,12,3),2);

    @Test
    void getDOB() {
        assertEquals(new LocalDate(1985,7,12), lecturer1.getDOB());
    }

    @Test
    void getCoursesTaught() {
        CourseProgramme course1 = new CourseProgramme("Discrete Maths", 1);
        CourseProgramme course2 = new CourseProgramme("Information Retrieval", 2);
        lecturer1.setCoursesTaught(course1);
        lecturer1.setCoursesTaught(course2);

        assertEquals("[Discrete Maths, Information Retrieval]" , lecturer1.getCoursesTaught().toString());
    }
    @Test
    void getId() {

        System.out.println(lecturer1.getId());
        System.out.println(lecturer2.getId());
        assertEquals(1, lecturer1.getId());
        assertEquals(2, lecturer2.getId());
    }

    @Test
    void getUsername(){
        assertEquals("danielradcliff37", lecturer1.getUsername());
    }

    @Test
    void getName() {
        assertEquals("Daniel Radcliff", lecturer1.getName());
    }

    @Test
    void getAge() {
        assertEquals(37, lecturer1.getAge());
    }
}