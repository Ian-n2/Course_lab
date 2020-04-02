package com.codeclan.example.CourseTracker;

import com.codeclan.example.CourseTracker.models.Booking;
import com.codeclan.example.CourseTracker.models.Course;
import com.codeclan.example.CourseTracker.models.Customer;
import com.codeclan.example.CourseTracker.repositories.BookingRepository;
import com.codeclan.example.CourseTracker.repositories.CourseRepository;
import com.codeclan.example.CourseTracker.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CourseTrackerApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {

	}

	@Test
	public void canCreateCourseCustomerAndBooking(){
		Course course = new Course("Karate", "Glasgow", 5);
		courseRepository.save(course);
		Customer customer = new Customer("Ian", "Glasgow", 28);
		customerRepository.save(customer);
		Booking booking = new Booking("02-04-2020", course, customer);
		bookingRepository.save(booking);
	}


}
