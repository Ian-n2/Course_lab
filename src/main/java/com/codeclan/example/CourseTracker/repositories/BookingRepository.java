package com.codeclan.example.CourseTracker.repositories;

import com.codeclan.example.CourseTracker.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findBookingByDate(String Date);
}
