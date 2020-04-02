package com.codeclan.example.CourseTracker.controller;

import com.codeclan.example.CourseTracker.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping()
    public ResponseEntity findCustomerByBookingsCourseName(
            @RequestParam(name ="courseName", required = false) String courseName,
            @RequestParam(name = "town", required = false) String town,
            @RequestParam(name = "age", required = false) Integer age){
        if (courseName != null){
            return new ResponseEntity(customerRepository.findCustomerByBookingsCourseName(courseName), HttpStatus.OK);
        }
        if(town != null && courseName != null){
            return new ResponseEntity(customerRepository.findCustomersByTownAndBookingsCourseName(town,courseName),HttpStatus.OK);
        }
        if(age != null && town != null && courseName != null){
            return new ResponseEntity(customerRepository.findCustomersByAgeGreaterThanEqualAndTownAndBookingsCourseName(age,town,courseName),HttpStatus.OK);
        }
        return new ResponseEntity(customerRepository.findAll(),HttpStatus.OK);
    }
 }
