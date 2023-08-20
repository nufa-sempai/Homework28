package com.example.homework28.service;

import org.springframework.stereotype.Service;
import com.example.homework28.model.Faculty;
import com.example.homework28.repository.FacultyRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class FacultyService {
    private FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty getFaculty(long id) {
        return facultyRepository.findById(id).get();
    }

    public Faculty editFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public void removeFaculty(long id) {
        facultyRepository.deleteById(id);
    }

    public Collection<Faculty> filterByColor(String color) {
        return facultyRepository.findAll().stream()
                .filter(e -> e.getColor().equals(color))
                .collect(Collectors.toList());
    }
}