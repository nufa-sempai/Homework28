package com.example.homework28.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.homework28.model.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty,Long> {
}