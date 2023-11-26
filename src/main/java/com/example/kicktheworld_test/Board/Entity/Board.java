//package com.example.kicktheworld_test.Board.Entity;
//
//import com.example.kicktheworld_test.Board.Constant.BoardCategory;
//import com.example.kicktheworld_test.Board.Dto.BoardDto;
//import com.example.kicktheworld_test.Security.entity.Member;
//import com.fasterxml.jackson.databind.ser.Serializers;
//import jakarta.persistence.*;
//import lombok.*;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import java.util.Date;
//import java.util.List;
//
//@Entity
//@Getter
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//public class Board extends BaseEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "board_id", updatable = false)
//    private Long board_id;
//
//
//    private String title;   //제목
//    private String content;   //본문내용
//
//    @Enumerated(EnumType.STRING)
//    private BoardCategory category; // 카테고리
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Member member;//작성자
//
//    @OneToMany(mappedBy = "board", orphanRemoval = true)
//    private List<Like> likes;       //좋아요
//    private Integer likeCnt;        //좋아요 수
//
//
//    @OneToMany(mappedBy = "board", orphanRemoval = true)
//    private List<Comment> comments; //댓글
//    private Integer commentCnt;     //댓글 수
//
////    @OneToOne(fetch = FetchType.LAZY)
////    private UploadImage uploadImage;
//
//    public void update(BoardDto dto) {
//        this.title = dto.getTitle();
//        this.content = dto.getContent();
//    }
//
//    public void likeChange(Integer likeCnt) {
//        this.likeCnt = likeCnt;
//    }
//
//    public void commentChange(Integer commentCnt) {
//        this.commentCnt = commentCnt;
//    }
//
////    public void setUploadImage(UploadImage uploadImage) {
////        this.uploadImage = uploadImage;
////    }
//}