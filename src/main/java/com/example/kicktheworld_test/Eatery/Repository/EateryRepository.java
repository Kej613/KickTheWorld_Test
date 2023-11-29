package com.example.kicktheworld_test.Eatery.Repository;

import com.example.kicktheworld_test.Eatery.Entity.Eatery;
import org.springframework.data.jpa.repository.JpaRepository;

// crud 제공
public interface EateryRepository extends JpaRepository<Eatery, Long> {

}