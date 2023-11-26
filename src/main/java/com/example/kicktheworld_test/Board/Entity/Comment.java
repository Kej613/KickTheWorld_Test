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
//public class Comment extends BaseEntity{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long comment_id;
//
//    private String body;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Member member;      // 작성자
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Board board;    // 댓글이 달린 게시판
//
//    public void update(String newBody) {
//        this.body = newBody;
//    }
//}