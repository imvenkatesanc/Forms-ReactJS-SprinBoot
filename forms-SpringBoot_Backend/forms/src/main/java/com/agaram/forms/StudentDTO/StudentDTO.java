package com.agaram.forms.StudentDTO;

public class StudentDTO {
    private int student_id;
    private String name;
    private String education;
    private String city;
    private String email;

    public StudentDTO(int student_id, String name, String education, String city, String email) {
        this.student_id = student_id;
        this.name = name;
        this.education = education;
        this.city = city;
        this.email = email;
    }

    public StudentDTO() {
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "student_id=" + student_id +
                ", name='" + name + '\'' +
                ", education='" + education + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
