package com.codeclan.example.CourseTracker.repositories;

import com.codeclan.example.CourseTracker.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {


}
