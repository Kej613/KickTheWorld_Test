//package com.example.kicktheworld_test.Board.Dto;
//
//import com.example.kicktheworld_test.Board.Entity.Board;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//public class AddBoardRequest {
//    private String title;
//    private String content;
//    private String mem_id;
//    private String board_category;
//
//    public Board toEntity() {
//        return Board.builder()
//                .title(title)
//                .content(content)
//                .mem_id(mem_id)
//                .board_category(board_category)
//                .build();
//    }
//}