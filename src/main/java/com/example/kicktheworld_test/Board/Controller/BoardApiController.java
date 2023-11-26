//package com.example.kicktheworld_test.Board.Controller;
//
//import com.example.kicktheworld_test.Board.Dto.AddBoardRequest;
//import com.example.kicktheworld_test.Board.Dto.BoardViewResponse;
//import com.example.kicktheworld_test.Board.Dto.UpdateBoardRequest;
//import com.example.kicktheworld_test.Board.Entity.Board;
//import com.example.kicktheworld_test.Board.Service.BoardService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//@RequiredArgsConstructor
//@RestController
//public class BoardApiController {
//
//    private final BoardService boardService;
//
//
//    //게시글 등록
//    @PostMapping("/api/boards")
//    public ResponseEntity<Board> addBoard(@RequestBody AddBoardRequest request) {
//        Board savedBoard = boardService.save(request);
//
//        return ResponseEntity.status(HttpStatus.CREATED)
//                .body(savedBoard);
//    }
//
//    /*@PostMapping(value = "/api/boards", consumes = {"multipart/form-data"})
//    public ResponseEntity<Board> addBoard(@RequestPart AddBoardRequest request,
//                                          @RequestPart(name = "files", required = false) List<MultipartFile> files) throws IOException {
//
//        Board savedBoard = boardService.save(request, files);
//
//        return ResponseEntity.status(HttpStatus.CREATED)
//                .body(savedBoard);
//    }*/
//
////    @GetMapping("/api/boards")
////    public ResponseEntity<List<BoardViewResponse>> findAllBoards() {
////        List<BoardViewResponse> boards = boardService.findAll()
////                .stream()
////                .map(BoardViewResponse::new)
////                .toList();
////
////        return ResponseEntity.ok()
////                .body(boards);
////    }
//
//    //게시글 상세보기
//    @GetMapping("/api/boards/{id}")
//    public ResponseEntity<BoardViewResponse> findBoard(@PathVariable long id) {
//        Board board = boardService.findById(id);
//
//        return ResponseEntity.ok()
//                .body(new BoardViewResponse(board));
//    }
//
//    //게시글 삭제
//    @DeleteMapping("/api/boards/{id}")
//    public ResponseEntity<Void> deleteBoard(@PathVariable long id) {
//        boardService.delete(id);
//
//        return ResponseEntity.ok()
//                .build();
//    }
//    //게시글 갱신
//    @PutMapping("/api/boards/{id}")
//    public ResponseEntity<Board> updateBoard(@PathVariable long id,
//                                             @RequestBody UpdateBoardRequest request) {
//        Board updatedBoard = boardService.update(id, request);
//
//        return ResponseEntity.ok()
//                .body(updatedBoard);
//    }
//
//}