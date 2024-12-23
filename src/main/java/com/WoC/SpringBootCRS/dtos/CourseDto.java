package com.WoC.SpringBootCRS.dtos;

import com.WoC.SpringBootCRS.entities.CourseRequestForm;
import com.WoC.SpringBootCRS.entities.Professor;
import com.WoC.SpringBootCRS.entities.Semester;
import com.WoC.SpringBootCRS.entities.Student;
import lombok.Data;

import java.util.Set;

@Data
public class CourseDto {
    private String courseName;
    private int capacity;
    private int remainingSeats;
    private Long professorId;
    private Long semesterId;
    private int courseCredit;


    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRemainingSeats() {
        return remainingSeats;
    }

    public void setRemainingSeats(int remainingSeats) {
        this.remainingSeats = remainingSeats;
    }

    public Long getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Long professorId) {
        this.professorId = professorId;
    }

    public Long getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(Long semesterId) {
        this.semesterId = semesterId;
    }
}
