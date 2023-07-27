package com.agaram.forms.StudentService;

import com.agaram.forms.StudentDTO.StudentDTO;
import com.agaram.forms.StudentDTO.StudentSaveDTO;
import com.agaram.forms.StudentDTO.StudentUpdateDTO;
import com.agaram.forms.StudentEntity.Student;
import com.agaram.forms.StudentRepo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceIMPL implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public String addStudents(StudentSaveDTO studentSaveDTO){
        Student student= new Student(studentSaveDTO.getName(),studentSaveDTO.getEducation(),studentSaveDTO.getCity(),studentSaveDTO.getEmail());
        studentRepo.save(student);
        return student.getName();
    }

    @Override
    public List<StudentDTO> allStudent() {
        List<Student>getStudents = studentRepo.findAll();
        List<StudentDTO>studentDTOList = new ArrayList<>();
        for(Student a:getStudents){
            StudentDTO studentDTO = new StudentDTO(a.getStudent_id(),a.getName(),a.getEducation(),a.getCity(),a.getEmail());
            studentDTOList.add(studentDTO);
        }
        return studentDTOList;
    }

    @Override
    public boolean deleteStudent(int id) {
        if(studentRepo.existsById(id)){
            studentRepo.deleteById(id);
        }
        else {
            System.out.println("Student ID is not found!");
        }

        return true;
    }


    @Override
    public String updateStudents(StudentUpdateDTO studentUpdateDTO) {
        if (studentRepo.existsById(studentUpdateDTO.getStudent_id())) {
            Student student = studentRepo.getById(studentUpdateDTO.getStudent_id());
            student.setName(studentUpdateDTO.getName());
            student.setEducation(studentUpdateDTO.getEducation());
            student.setCity(studentUpdateDTO.getCity());
            student.setEmail(studentUpdateDTO.getEmail());
            studentRepo.save(student);
        } else {
            System.out.println("Student ID is not found!");
        }
        return null;
    }

}
