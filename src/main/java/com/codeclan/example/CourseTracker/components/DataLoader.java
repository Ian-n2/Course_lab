package com.codeclan.example.CourseTracker.components;

import com.codeclan.example.CourseTracker.models.Booking;
import com.codeclan.example.CourseTracker.models.Course;
import com.codeclan.example.CourseTracker.models.Customer;
import com.codeclan.example.CourseTracker.repositories.BookingRepository;
import com.codeclan.example.CourseTracker.repositories.CourseRepository;
import com.codeclan.example.CourseTracker.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public void run(ApplicationArguments args){
        Course course1 = new Course("Tennis", "London", 2);
        courseRepository.save(course1);

        Course course2 = new Course("Arts & Crafts", "Birmingham", 4);
        courseRepository.save(course2);

        Course course3 = new Course("Breadmaking", "Edinburgh", 1);
        courseRepository.save(course3);

        Customer customer1 = new Customer("Ian", "Glasgow", 28);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Meredith", "Glasgow", 26);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Steve", "Glasgow", 39);
        customerRepository.save(customer3);

        Customer customer4 = new Customer("Peter", "Poland", 30);
        customerRepository.save(customer4);

        Booking booking1 = new Booking("03-08-2020", course3, customer2);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("30-01-2020", course1, customer1);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("01-08-2019", course2, customer3);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("01-08-2019", course2, customer1);
        bookingRepository.save(booking4);

        Booking booking5 = new Booking("01-08-2019", course3, customer4);
        bookingRepository.save(booking5);

    }
}
