package com.codeclan.example.CourseTracker.controller;

import com.codeclan.example.CourseTracker.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {
    @Autowired
    CourseRepository courseRepository;


  @GetMapping
    public ResponseEntity findCourseByRating(
            @RequestParam(name ="rating", required = false) Integer rating,
            @RequestParam(name = "customerName", required = false) String customerName){
      if (rating != null) {
          return new ResponseEntity(courseRepository.findCourseByRating(rating), HttpStatus.OK);
      }
      if (customerName != null ){
          return new ResponseEntity(courseRepository.findCourseByBookingsCustomerName(customerName), HttpStatus.OK);
      }
      return new ResponseEntity(courseRepository.findAll(), HttpStatus.OK);

  }


}
