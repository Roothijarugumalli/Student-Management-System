package com.palle.service;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palle.dto.StudentDto;
import com.palle.entity.Student;
import com.palle.exception.ResourceNotFoundException;
import com.palle.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    // 1. Insert
    public Student insertStudent(StudentDto dto) {

        Student s = new Student();
        s.setsName(dto.getsName());
        s.seteMail(dto.geteMail());
        s.setMobile(dto.getMobile());
        s.setAge(dto.getAge());
        s.setGender(dto.getGender());

        return repository.save(s);
    }

    // 2. Read all
    public List<Student> readAllStudent() {
        return repository.findAll();
    }

    // 3. Read one
    public Student readOneStudent(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student with id " + id + " not found"));
    }

    // 4. Update
    public Student updateStudent(int id, Student s) {

        Student existingStudent = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student with id " + id + " not found"));

        existingStudent.setsName(s.getsName());
        existingStudent.seteMail(s.geteMail());
        existingStudent.setMobile(s.getMobile());
        existingStudent.setAge(s.getAge());
        existingStudent.setGender(s.getGender());

        return repository.save(existingStudent);
    }

    // 5. Delete
    public String deleteStudent(int id) {

        Student student = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student with id " + id + " not found"));

        repository.delete(student);
        return "Student with id " + id + " is deleted";
    }
}