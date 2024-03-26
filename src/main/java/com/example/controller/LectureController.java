package com.example.controller;

import com.example.lecture.LectureApplication;
import com.example.service.LectureService;

@RestController
@RequestMapping("/lecture")
public class LectureController {

  public com.example.lecture.LectureApplication LectureApplication;

  public LectureController(LectureApplication lectureApplication) {
    this.LectureApplication = lectureApplication;
  }

  @PostMapping("/apply")
  public ResponseEntity<String> applyForLecture(@RequestParam("userId") String userId) {
    LectureService.applyForLecture(userId);
    return ResponseEntity.ok("특강 신청이 완료되었습니다.");
  }

  @GetMapping("/status")
  public ResponseEntity<Map<String, Object>> getLectureStatus(@RequestParam("userId") String userId) {
    boolean success = LectureService.checkLectureStatus(userId);
    Map<String, Object> response = new HashMap<>();
    response.put("success", success);
    response.put("message", success ? "특강 신청이 완료되었습니다." : "특강 신청이 실패하였습니다.");
    return ResponseEntity.ok(response);
  }
}
