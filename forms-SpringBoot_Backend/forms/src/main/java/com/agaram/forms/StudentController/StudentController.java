package com.agaram.forms.StudentController;

import com.agaram.forms.StudentDTO.StudentDTO;
import com.agaram.forms.StudentDTO.StudentSaveDTO;
import com.agaram.forms.StudentDTO.StudentUpdateDTO;
import com.agaram.forms.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public String saveStudents(@Validated @RequestBody StudentSaveDTO studentSaveDTO) {
        String id = studentService.addStudents(studentSaveDTO);
        return id;
    }

    @GetMapping("/allStudent")
    public ResponseEntity<List<StudentDTO>> allStudent() {
        List<StudentDTO> allStudents = studentService.allStudent();
        return ResponseEntity.ok(allStudents);
    }

    @PostMapping("/update")
    public String updateStudent(@RequestBody StudentUpdateDTO studentUpdateDTO) {
        String id = studentService.updateStudents(studentUpdateDTO);
        return id;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable(value = "id") int id) {
        boolean delete = studentService.deleteStudent(id);
        if (delete) {
            return ResponseEntity.ok("Deleted!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
