package com.example.kicktheworld_test.Trip.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class TripSearchDto {   //여행지 검색폼
    private String searchBy;
    private String searchQuery = "";
}
