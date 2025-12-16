package com.sms.model;

import java.sql.Date;

public class Student {

    private int id;
    private String name;
    private String email;
    private String phone;
    private String course;
    private Date dob;
    private String gender;

    public Student(String name, String email, String phone,
                   String course, Date dob, String gender) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.course = course;
        this.dob = dob;
        this.gender = gender;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getCourse() { return course; }
    public Date getDob() { return dob; }
    public String getGender() { return gender; }
}

