//package com.example.kicktheworld_test.Board.Entity;
//
//import com.example.kicktheworld_test.Security.entity.Member;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@Getter
//public class Like {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Member member;      // 좋아요를 누른 유저
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Board board;    // 좋아요가 추가된 게시글
//}
