//package com.example.kicktheworld_test.Board.Service;
//
//
//import com.example.kicktheworld_test.Board.Dto.*;
//import com.example.kicktheworld_test.Board.Entity.Board;
//import com.example.kicktheworld_test.Board.Repository.BoardRepository;
//import jakarta.transaction.Transactional;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//@RequiredArgsConstructor
//@Service
//public class BoardService {
//    private final BoardRepository boardRepository;
//
////    private final FileRepository fileRepository;
////
////    public Board save(AddBoardRequest request) {
////        return boardRepository.save(request.toEntity());
////
////    }
//
////    public Board save(AddBoardRequest request, List<MultipartFile> files) throws IOException {
////
////        Board board = boardRepository.save(request.toEntity());
////
////        // 파일 저장
////        if (files != null && !files.isEmpty()) {
////            /* 지원하지 않는 확장자 파일 제거 */
////            List<MultipartFile> validatedFiles = filesValidation(files);
////
////            /* 걸러진 파일들 업로드 */
////            filesUpload(validatedFiles, board.getId());
////
////            /* 유효성 검증을 끝낸 파일들을 하나씩 꺼냄. */
////            for (MultipartFile validatedFile : validatedFiles) {
////                /* File Entity 생성 후 저장 */
////                File file = new File(validatedFile, board);
////
////                fileRepository.save(file);
////            }
////        }
////
////        return board;
////    }
//
////    public List<Board> findAll() {
////        return boardRepository.findAll();
////    }
//
//    // 전체 조회 - 페이징, 글 번호(id) 기준으로 역순 출력
//    public Page<Board> findAll(int page){
//        List <Sort.Order> sorts = new ArrayList<>();
//        sorts.add(Sort.Order.desc("id"));
//        Pageable pageable = PageRequest.of(page, 10, Sort.by(sorts));
//        return this.boardRepository.findAll(pageable);
//    }
//
//    public Board findById(long id) {
//        return boardRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));
//    }
//
////    public List<FileFormat> findFileByBoard(Long id) {
////        List<File> fileList = fileRepository.findFileByFileKey("board", id);
////
////        List<FileFormat> fileFormatList = new ArrayList<>();
////
////        if (fileList != null) {
////            for (int i = 0; i < fileList.size(); i++) {
////                FileFormat fileFormat = new FileFormat(fileList.get(i));
////                fileFormatList.add(fileFormat);
////            }
////        }
////
////        return fileFormatList;
////    }
//
//    public void delete(long id) {
//        boardRepository.deleteById(id);
//    }
//
//
////    @Transactional
////    public Board update(long id, UpdateBoardRequest request) {
////        Board article = boardRepository.findById(id)
////                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));
////
////        article.update(request.getTitle(), request.getContent(),request.getBoard_category(), request.getMem_id());
////
////        return article;
////    }
//
////    /*파일의 유효성 검증*/
////    private List<MultipartFile> filesValidation(List<MultipartFile> files) throws IOException {
////        //*접근 거부 파일 확장자명*//*
////        String[] accessDeniedFileExtension = {"exe", "zip"};
////        //*접근 거부 파일 컨텐츠 타입*//*
////        String[] accessDeniedFileContentType = {"application/x-msdos-program", "application/zip"};
////
////        ArrayList<MultipartFile> validatedFiles = new ArrayList<>();
////
////        for (MultipartFile file : files) {
////            //*원본 파일 이름*//*
////            String originalFileName = file.getOriginalFilename();
////            //*파일의 확장자명*//*
////            String fileExtension = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
////            //*파일의 컨텐츠타입*//*
////            String fileContentType = file.getContentType();
////
////            //*accessDeniedFileExtension, accessDeniedFileContentType -> 업로드 불가*//*
////            if (Arrays.asList(accessDeniedFileExtension).contains(fileExtension) ||
////                    Arrays.asList(accessDeniedFileContentType).contains(fileContentType)) {
////                log.warn(fileExtension + "(" + fileContentType + ") 파일은 지원하지 않는 확장자입니다.");
////            } else {//*업로드 가능*//*
////                validatedFiles.add(file);
////            }
////        }
////        return validatedFiles;
////    }
//
////    /*파일 업로드 메소드*/
////    private void filesUpload(List<MultipartFile> files, Long postId) throws IOException {
////        //*프로젝트 루트 경로*//*
////        String rootDir = System.getProperty("user.dir");
////
////        for (MultipartFile file : files) {
////            //* 파일 이름 생성 및 수정 *//*
////            String fileName = postId + "_" + file.getOriginalFilename();
////            fileName = fileName.replaceAll("\\s", "_"); // 공백을 언더스코어로 대체
////            fileName = fileName.replaceAll("[^a-zA-Z0-9_.]", ""); // 영문자, 숫자, 언더스코어, 마침표 이외의 문자 제거
////
////            //* 업로드 경로 *//*
////            java.io.File uploadPath = new java.io.File(rootDir + "/media/post/");
////            uploadPath.mkdirs(); // 디렉토리가 존재하지 않으면 생성
////
////            uploadPath = new java.io.File(uploadPath, fileName); // 파일 이름을 포함한 전체 경로
////
////            //* 업로드 *//*
////            file.transferTo(uploadPath);
////        }
////    }
//
//}