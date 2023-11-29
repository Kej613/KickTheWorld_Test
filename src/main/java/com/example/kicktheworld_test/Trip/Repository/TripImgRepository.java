package com.example.kicktheworld_test.Trip.Repository;

import com.example.kicktheworld_test.Trip.Entity.TripImg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TripImgRepository extends JpaRepository<TripImg, Long> {
    List<TripImg> findByIdOrderByIdAsc(Long id);
}