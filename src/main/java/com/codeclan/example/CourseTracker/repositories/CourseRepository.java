package com.codeclan.example.CourseTracker.repositories;

import com.codeclan.example.CourseTracker.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

List<Course> findCourseByRating(int rating);

List<Course> findCourseByBookingsCustomerName(String customerName);


}
