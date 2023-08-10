package com.example.homework28.service;

import org.springframework.stereotype.Service;
import com.example.homework28.model.Student;
import com.example.homework28.repository.StudentRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudent(long id) {
        return studentRepository.findById(id).get();
    }

    public Student editStudent(Student student) {
        return studentRepository.save(student);
    }

    public void   removeStudent(long id) {
        studentRepository.deleteById(id);
    }

    public Collection<Student> filterByAge(Integer age) {
        return studentRepository.findAll().stream()
                .filter(e->e.getAge() == age)
                .collect(Collectors.toList());

    }
}