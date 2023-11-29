package com.example.kicktheworld_test;


import com.example.kicktheworld_test.Trip.Dto.MainItemDto;
import com.example.kicktheworld_test.Trip.Dto.TripSearchDto;
import com.example.kicktheworld_test.Trip.Service.TripService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;


@Controller
@RequiredArgsConstructor
public class MainController {


    @GetMapping("/admin")
    public String adminPage() {
        return "adminPage";
    }


}