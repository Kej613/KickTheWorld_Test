package com.example.kicktheworld_test.Eatery.Dto;

import com.example.kicktheworld_test.Eatery.Entity.Eatery;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class EateryDto {

    private Long eatery_id;
    private String category;
    private String name;
    private String address;
    private String detail;


    public EateryDto(Eatery eatery) {
        this.name = eatery.getName();
        this.detail = eatery.getDetail();
        this.category = eatery.getCategory();
        this.address = eatery.getAddress();

    }

}

