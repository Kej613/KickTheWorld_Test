package com.example.kicktheworld_test.Trip.Repository;

import com.example.kicktheworld_test.Trip.Dto.MainItemDto;
import com.example.kicktheworld_test.Trip.Dto.TripSearchDto;
import com.example.kicktheworld_test.Trip.Entity.Trip;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TripRepositoryCustom {
    Page<Trip> getMainTripPage(TripSearchDto tripSearchDto, Pageable pageable);  //여행지 조회조건을 가지고 있는 페이지
    Page<MainItemDto> getTripPage(TripSearchDto tripSearchDto, Pageable pageable);  //메인화면에서 여행지가 보일 페이지
}
