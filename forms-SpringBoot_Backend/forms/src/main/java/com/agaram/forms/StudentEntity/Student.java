package com.agaram.forms.StudentEntity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "student_id", length = 60)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int student_id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "education", length = 70)
    private String education;

    @Column(name = "city", length = 60)
    private String city;

    @Column(name = "email", length = 40)
    private String email;

    public Student() {
        // Default constructor
    }

    public Student(String name, String education, String city, String email) {
        this.student_id = student_id;
        this.name = name;
        this.education = education;
        this.city = city;
        this.email = email;
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {return email;}

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", name='" + name + '\'' +
                ", education='" + education + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
