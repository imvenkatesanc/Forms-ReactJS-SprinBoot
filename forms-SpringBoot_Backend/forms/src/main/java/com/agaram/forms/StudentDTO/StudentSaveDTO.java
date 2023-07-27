package com.agaram.forms.StudentDTO;

public class StudentSaveDTO {

    private String name;
    private String education;
    private String city;
    private String email;

    public StudentSaveDTO(int student_id, String name, String education, String city, String email) {
        this.name = name;
        this.education = education;
        this.city = city;
        this.email = email;
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
        return "StudentSaveDTO{" +
                "name='" + name + '\'' +
                ", education='" + education + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
