//package com.example.kicktheworld_test.Board.Controller;
//
//import com.example.kicktheworld_test.Board.Dto.AddBoardRequest;
//import com.example.kicktheworld_test.Board.Dto.BoardViewResponse;
//import com.example.kicktheworld_test.Board.Dto.UpdateBoardRequest;
//import com.example.kicktheworld_test.Board.Entity.Board;
//import com.example.kicktheworld_test.Board.Service.BoardService;
//import com.example.kicktheworld_test.Stay.Entity.Stay;
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.domain.Page;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//@RequiredArgsConstructor
//@Controller
//public class BoardViewController {
//    private final BoardService boardService;
//
////    @GetMapping("/boards")
////    public String getBoards(Model model) {
////        List<BoardViewResponse> boards = boardService.findAll()
////                .stream()
////                .map(BoardViewResponse::new)
////                .toList();
////
////        model.addAttribute("boards", boards);
////
////        return "board/boardList";
////    }
//
//    // 전체 게시판 리스트 페이징
//    @GetMapping("/boards")
//    public String getBoards(Model model, @RequestParam(value="page", defaultValue = "0") int page){
//        Page<Board> boardsPaging = this.boardService.findAll(page);
//        model.addAttribute("boardPaging", boardsPaging);
//        return "board/boardList";
//    }
//
//    @GetMapping("/boards/{id}")
//    public String getBoard(@PathVariable Long id, Model model) {
//        Board board = boardService.findById(id);
//
//        // List<FileFormat> fileFormatList = boardService.findFileByBoard(id);
//
//       /* if (fileFormatList != null) {
//            model.addAttribute("board", new BoardViewResponse(board, fileFormatList));
//        } else {
//            model.addAttribute("board", new BoardViewResponse(board));
//        }*/
//
//        model.addAttribute("board", new BoardViewResponse(board));
////        model.addAttribute("board", new BoardViewResponse(board, fileFormatList));
////        model.addAttribute("fileList", fileFormatList);
//
//        return "board/board";
//    }
//
//
//    //게시글 등록
//    @PostMapping("/new-board")
//    public ResponseEntity<Board> addBoard(@RequestBody AddBoardRequest request) {
//        Board savedBoard = boardService.save(request);
//
//        return ResponseEntity.status(HttpStatus.CREATED)
//                .body(savedBoard);
//    }
//
//    @GetMapping("/new-board-form")
//    public String newBoardForm(@RequestParam(required = false) Long id, Model model) {
//        if (id == null) {
//            model.addAttribute("board", new BoardViewResponse());
//        } else {
//            Board board = boardService.findById(id);
//            model.addAttribute("board", new BoardViewResponse(board));
//        }
//
//        return "board/newBoard";
//    }
//
//    //게시글 삭제
//    @DeleteMapping("/boards/{id}")
//    public ResponseEntity<Void> deleteBoard(@PathVariable long id) {
//        boardService.delete(id);
//
//        return ResponseEntity.ok()
//                .build();
//    }
//    //게시글 갱신
//    @PutMapping("/boards/{id}")
//    public ResponseEntity<Board> updateBoard(@PathVariable long id,
//                                             @RequestBody UpdateBoardRequest request) {
//        Board updatedBoard = boardService.update(id, request);
//
//        return ResponseEntity.ok()
//                .body(updatedBoard);
//    }
//
//
//}