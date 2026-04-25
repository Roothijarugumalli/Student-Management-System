package com.palle.controller;






import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.palle.dto.StudentDto;
import com.palle.entity.Student;
import com.palle.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/studentapp")
public class StudentController {

    @Autowired
    private StudentService service;

    // 1. Insert
    @PostMapping("/insert")
    public Student insertStudent(@Valid @RequestBody StudentDto dto) {
        return service.insertStudent(dto);
    }

    // 2. Read all
    @GetMapping("/readall")
    public List<Student> readAllStudent() {
        return service.readAllStudent();
    }

    // 3. Read one
    @GetMapping("/readone/{id}")
    public Student readOneStudent(@PathVariable int id) {
        return service.readOneStudent(id); // ✅ fixed
    }

    // 4. Update
    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student s) {
        return service.updateStudent(id, s); // ✅ fixed method name
    }

    // 5. Delete
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }
}