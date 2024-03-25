package com.example.service;

import com.example.model.LectureModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LectureService {
  LectureModel lectureModel;
  public static boolean checkLectureStatus(String userId) {
    return registrationFlag = true;
  }
  public LectureService lectureService;
  public LectureService(LectureService lectureService) {
    this.lectureService = lectureService;
  }

  public void applyForSeminar(String userId) {
    LectureService.applyForLecture(userId);
  }

  public static void applyForLecture(String userId) {
  }

  public boolean checkSeminarStatus(String userId) {
    return LectureService.checkLectureStatus(userId);
  }




}
