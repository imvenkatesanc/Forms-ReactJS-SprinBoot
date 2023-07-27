package com.agaram.forms.StudentService;

import com.agaram.forms.StudentDTO.StudentDTO;
import com.agaram.forms.StudentDTO.StudentSaveDTO;
import com.agaram.forms.StudentDTO.StudentUpdateDTO;

import java.util.List;

public interface StudentService {
    String addStudents(StudentSaveDTO studentSaveDTO);

    List<StudentDTO> allStudent();

    boolean deleteStudent(int id);

    String updateStudents(StudentUpdateDTO studentUpdateDTO);
}
