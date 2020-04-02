package com.codeclan.example.CourseTracker.repositories;

import com.codeclan.example.CourseTracker.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
