package com.codeclan.example.CourseTracker.repositories;

import com.codeclan.example.CourseTracker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


  List<Customer> findCustomerByBookingsCourseName(String courseName);

  List<Customer> findCustomersByTownAndBookingsCourseName(String town, String course);

  List<Customer> findCustomersByAgeGreaterThanEqualAndTownAndBookingsCourseName(int age, String town, String course);
}
