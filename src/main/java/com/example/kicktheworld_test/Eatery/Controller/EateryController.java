package com.example.kicktheworld_test.Eatery.Controller;

import com.example.kicktheworld_test.Eatery.Dto.EateryDto;
import com.example.kicktheworld_test.Eatery.Entity.Eatery;
import com.example.kicktheworld_test.Eatery.Service.EateryService;
import com.example.kicktheworld_test.Stay.Entity.Stay;
import com.example.kicktheworld_test.Stay.dto.StayDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class EateryController {

    private final EateryService eateryService;

    //맛집 전체 리스트
    @GetMapping("/eaterys")
    public String getEaterys(Model model) {
        List<EateryDto> eaterys = eateryService.findAll()
                .stream()
                .map(EateryDto::new)
                .toList();
        model.addAttribute("eaterys", eaterys);

        return "eatery/eateryList";
    }


    // 음식점 상세 조회 뷰
    @GetMapping("/eaterys/{eatery_id}")
    public String getEatery(@PathVariable Long eatery_id, Model model) {
        Eatery eatery = eateryService.findById(eatery_id);
        model.addAttribute("eatery", new EateryDto(eatery));

        return "eatery/eateryDetail";
    }

    //음식점 등록
    @GetMapping("/eaterys/create")
    public String showCreateEateryForm(Model model) {
        model.addAttribute("eatery", new Eatery());
        return "eatery/createEatery";
    }

    @PostMapping("/eaterys/create")
    public String createEaterys(@ModelAttribute Eatery eatery) {
        eateryService.save(eatery);
        return "redirect:/eaterys";
    }


    //음식점 수정



    //음식점 삭제




}