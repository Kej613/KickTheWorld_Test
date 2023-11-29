package com.example.kicktheworld_test.Eatery.Service;

import com.example.kicktheworld_test.Eatery.Dto.EateryDto;
import com.example.kicktheworld_test.Eatery.Entity.Eatery;
import com.example.kicktheworld_test.Eatery.Repository.EateryRepository;
import com.example.kicktheworld_test.Stay.Entity.Stay;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EateryService {

    private final EateryRepository eateryRepository;


    //음식점 DB저장
    public Eatery save(Eatery eatery){
        return eateryRepository.save(eatery);
    }


    //전체리스트
    public List<Eatery> findAll() {

        return eateryRepository.findAll();
    }

    //id에 맞는 상세보기
    public Eatery findById(long eatery_id) {
        return eateryRepository.findById(eatery_id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + eatery_id));
    }




}