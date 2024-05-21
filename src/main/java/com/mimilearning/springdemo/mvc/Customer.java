package com.mimilearning.springdemo.mvc;

import com.mimilearning.springdemo.mvc.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    @CourseCode(value = "mimi",message = "should start with mimi !")
    private String courseCode ;
    private String fistName ;
    @NotNull(message = "is required ! ")
    @Size(min =1,message = "is required !")
    private  String lastName ;
    @Pattern(regexp ="^[a-zA-Z-9]{5}",message = "only 5 characters ! ")
    private String postalCode ;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer  getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }
    @NotNull(message = "is required ! ")
    @Max(value = 10,message = "should be less or equal to ten")
    @Min(value = 0,message = "should be greater or equal to zero")
    private Integer freePasses ;

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
