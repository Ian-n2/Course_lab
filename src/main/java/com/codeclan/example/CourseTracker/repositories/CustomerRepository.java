package com.codeclan.example.CourseTracker.repositories;

import com.codeclan.example.CourseTracker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
