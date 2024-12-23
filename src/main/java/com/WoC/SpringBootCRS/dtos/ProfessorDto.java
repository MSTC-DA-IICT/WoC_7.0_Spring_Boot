package com.WoC.SpringBootCRS.dtos;

import com.WoC.SpringBootCRS.entities.Course;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class ProfessorDto {
    private String name;
    private String email;
    private String password;
    private List<Long> courseIds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public List<Long> getCourseIds() {
        return courseIds;
    }

    public void setCourseIds(List<Long> courseIds) {
        this.courseIds = courseIds;
    }
}
