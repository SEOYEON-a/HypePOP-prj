package org.hype.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hype.domain.Criteria;
import org.hype.domain.psReplyVO;
import org.hype.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.extern.log4j.Log4j;

@Log4j
@RestController
@RequestMapping("/reply")
public class ReplyController {

   @Autowired
    private ReplyService service;
   
   @PostMapping("/insertReply")
   @ResponseBody
   public ResponseEntity<Map<String, String>> insertReply(@RequestBody Map<String, Object> requestData) {
       
       // psNo, psScore, userNo를 Integer로 직접 받아오기
       int psNo = (requestData.get("psNo") instanceof Integer) ? (Integer) requestData.get("psNo") : Integer.parseInt((String) requestData.get("psNo"));
       int psScore = (requestData.get("psScore") instanceof Integer) ? (Integer) requestData.get("psScore") : Integer.parseInt((String) requestData.get("psScore"));
       String psComment = (String) requestData.get("psComment");
       int userNo = (requestData.get("userNo") instanceof Integer) ? (Integer) requestData.get("userNo") : Integer.parseInt((String) requestData.get("userNo"));

       System.out.println("psNo: " + psNo);
       System.out.println("rating: " + psScore);
       System.out.println("reviewText: " + psComment);
       System.out.println("userNo: " + userNo);
       
       psReplyVO vo = new psReplyVO();
       
       vo.setPsNo(psNo);
       vo.setPsScore(psScore);
       vo.setPsComment(psComment);
       vo.setUserNo(userNo);
       
       Integer result = service.insertPopUpReply(vo);
     
       // 응답 데이터 생성
       Map<String, String> response = new HashMap<>();
       if (result != null && result > 0) {
           response.put("status", "success");
           response.put("message", "댓글이 성공적으로 등록되었습니다.");
       } else {
           response.put("status", "failure");
           response.put("message", "댓글 등록에 실패하였습니다.");
       }

       // JSON 응답 전송
       return ResponseEntity.ok()
           .contentType(MediaType.APPLICATION_JSON)
           .body(response);
   }



   @PostMapping("/getUserReviews")
   public ResponseEntity<Map<String, Object>> getUserReviews(@RequestBody Map<String, Integer> request) {
       // 요청 본문에서 psNo와 userNo 추출
       Integer psNo = request.get("psNo");
       Integer userNo = request.get("userNo");
       System.out.println("Received request: " + request);


       // 리뷰 가져오기
       List<psReplyVO> reviews = service.getUserReviews(psNo, userNo);

       // 응답 맵 구성
       Map<String, Object> response = new HashMap<>();
       response.put("status", "success");
       response.put("message", reviews.isEmpty() ? "리뷰가 없습니다." : "리뷰를 불러왔습니다.");
       response.put("reviews", reviews);

       return ResponseEntity.ok()
               .contentType(MediaType.APPLICATION_JSON)
               .body(response);
   }
   @PostMapping("/checkUserReview")
   public ResponseEntity<Map<String, Boolean>> checkUserReview(@RequestBody psReplyVO request) {
       int psNo = request.getPsNo();
       int userNo = request.getUserNo();

       // 유저가 이미 리뷰를 작성했는지 확인
       boolean hasReviewed = service.hasUserReviewed(psNo, userNo);

       // 응답 데이터 생성
       Map<String, Boolean> response = new HashMap<>();
       response.put("hasReviewed", hasReviewed);

       // JSON 형식으로 응답 반환
       return ResponseEntity.ok()
               .contentType(MediaType.APPLICATION_JSON)
               .body(response);
   }
   @PostMapping("/deleteReview")
   public ResponseEntity<Map<String, Object>> deleteReview(@RequestBody Map<String, Integer> request) {
       int reviewId = request.get("reviewId"); // reviewId를 직접 가져옴
       System.out.println("댓글 번호 : " + reviewId);
       boolean isDeleted = service.deleteReview(reviewId); // 리뷰 삭제 시도

       // 응답 데이터 생성
       Map<String, Object> response = new HashMap<>();
       response.put("isDeleted", isDeleted); // 삭제 성공 여부

       // JSON 형식으로 응답 반환
       return ResponseEntity.ok()
               .contentType(MediaType.APPLICATION_JSON)
               .body(response);
   }
   @PostMapping("/updateReply")
   @ResponseBody
   public ResponseEntity<Map<String, String>> updateReply(@RequestBody psReplyVO vo) {
       // 디버그 로깅
       System.out.println("psNo: " + vo.getPsNo());
       System.out.println("rating: " + vo.getPsScore());
       System.out.println("reviewText: " + vo.getPsComment());
       System.out.println("userNo: " + vo.getUserNo());

       // VO 객체 생성 및 값 설정
       psReplyVO rvo = new psReplyVO();
       rvo.setPsNo(vo.getPsNo());
       rvo.setPsScore(vo.getPsScore());
       rvo.setPsComment(vo.getPsComment());
       rvo.setUserNo(vo.getUserNo());

       Integer result = service.updateReply(rvo);

       // 응답 데이터 생성
       Map<String, String> response = new HashMap<>();
       if (result != null && result > 0) {
           response.put("status", "success");
           response.put("message", "댓글이 성공적으로 수정되었습니다.");
       } else {
           response.put("status", "failure");
           response.put("message", "댓글 수정에 실패하였습니다.");
       }

       // JSON 응답 전송
       return ResponseEntity.ok()
           .contentType(MediaType.APPLICATION_JSON)
           .body(response);
   }
   @PostMapping("/getOtherReviews")
   public ResponseEntity<Map<String, Object>> getOtherReviews(@RequestBody Map<String, Object> request) {
       // 요청 본문에서 psNo와 userNo 추출
       Integer psNo = Integer.parseInt(String.valueOf(request.get("psNo"))); // String에서 Integer로 변환
       Integer userNo = Integer.parseInt(String.valueOf(request.get("userNo"))); // String에서 Integer로 변환
       Integer pageNum = Integer.parseInt(String.valueOf(request.get("pageNum"))); // 페이지 번호
       Integer amount = Integer.parseInt(String.valueOf(request.get("amount"))); // 항목 수
       
       System.out.println("댓글 불러오기용 스토어 넘버는 ? : " + psNo);
       System.out.println("댓글 불러오기용 유저 넘버는 ? : " + userNo);

       System.out.println("Received request: " + request);

       // Criteria 객체 생성 및 설정
       Criteria cri = new Criteria();
       if (pageNum <= 0) {
           cri.setPageNum(1); // 기본 페이지 번호 설정
       } else {
           cri.setPageNum(pageNum);
       }

       if (amount <= 0) {
           cri.setAmount(10); // 기본 항목 수 설정
       } else {
           cri.setAmount(amount);
       }

       // 리뷰 가져오기
       List<psReplyVO> reviews = service.getOtherReviews(psNo, userNo, cri);
       
       System.out.println("불러온 리뷰 목록: " + reviews);
       System.out.println("전체 리뷰 수: " + service.getTotalReviews(psNo, userNo));

       // 응답 맵 구성
       Map<String, Object> response = new HashMap<>();
       response.put("status", "success");
       response.put("message", reviews.isEmpty() ? "리뷰가 없습니다." : "리뷰를 불러왔습니다.");
       response.put("reviews", reviews);
       response.put("totalReviews", service.getTotalReviews(psNo, userNo)); // 전체 리뷰 수 추가

       return ResponseEntity.ok()
               .contentType(MediaType.APPLICATION_JSON)
               .body(response);
   }
   
   
   @PostMapping("/getAllReviews")
   public ResponseEntity<Map<String, Object>> getAllReviews(@RequestBody Map<String, Object> request) {
       // 요청 본문에서 psNo와 userNo 추출
       Integer psNo = Integer.parseInt(String.valueOf(request.get("psNo"))); // String에서 Integer로 변환
       Integer pageNum = Integer.parseInt(String.valueOf(request.get("pageNum"))); // 페이지 번호
       Integer amount = Integer.parseInt(String.valueOf(request.get("amount"))); // 항목 수
       
       System.out.println("댓글 불러오기용 스토어 넘버는 ? : " + psNo);
       System.out.println("Received request: " + request);

       // Criteria 객체 생성 및 설정
       Criteria cri = new Criteria();
       if (pageNum <= 0) {
           cri.setPageNum(1); // 기본 페이지 번호 설정
       } else {
           cri.setPageNum(pageNum);
       }

       if (amount <= 0) {
           cri.setAmount(10); // 기본 항목 수 설정
       } else {
           cri.setAmount(amount);
       }

       // 리뷰 가져오기
       List<psReplyVO> reviews = service.getAllReviews(psNo, cri);
       


       // 응답 맵 구성
       Map<String, Object> response = new HashMap<>();
       response.put("status", "success");
       response.put("message", reviews.isEmpty() ? "리뷰가 없습니다." : "리뷰를 불러왔습니다.");
       response.put("reviews", reviews);
       response.put("totalReviews", service.getAllReviewcount(psNo)); // 전체 리뷰 수 추가

       return ResponseEntity.ok()
               .contentType(MediaType.APPLICATION_JSON)
               .body(response);
   }
   //(마이페이지에서 댓글 가져오기, 윤)

   @GetMapping(value ="/getMyPopupReply", produces = MediaType.APPLICATION_JSON_VALUE)
   @ResponseBody
   public ResponseEntity<Map<String, Object>> getMyPopupReply(
           @RequestParam int userNo, // 사용자 번호
           @RequestParam(defaultValue = "1") int pageNum, // 페이지 번호 (기본값 1)
           @RequestParam(defaultValue = "5") int amount) { // 페이지당 항목 수 (기본값 5)

      

       // 페이징 처리된 댓글 목록 가져오기
       List<psReplyVO> replies = service.getPopupRepliesWithPaging(userNo, pageNum, amount);

       if (pageNum <= 0) pageNum = 1;
       if (amount <= 0) amount = 5;
       
       // 전체 댓글 수 조회
       int totalCount = service.getTotalPopupReplyCount(userNo);

       if (replies == null || replies.isEmpty()) {
           return new ResponseEntity<>(HttpStatus.NO_CONTENT); // 댓글이 없으면 204 응답
       }

       // 댓글마다 팝업스토어 이름(psName)을 가져오기
       for (psReplyVO reply : replies) {
           String psName = service.getPsName(reply.getPsNo()); // psNo로 psName 조회
           reply.setPsName(psName); // psName 설정
           log.info("psName" + psName);
       }
       
      

       // 응답 객체 구성
       Map<String, Object> response = new HashMap<>();
       response.put("replies", replies); // 댓글 목록
       response.put("totalCount", totalCount); // 전체 댓글 수
       log.info("total:" + totalCount);

       return new ResponseEntity<>(response, HttpStatus.OK); // 댓글과 전체 댓글 수 포함한 응답
   }
}
