package com.example.service;

import com.example.model.LectureModel;
import com.example.repository.LectureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LectureService {
  public LectureRepository lectureRepository;
  LectureModel lectureModel1;
  public void applyForSeminar(String userId) {
    if (lectureRepository.isAlreadyRegistered(userId)) {
      throw new IllegalArgumentException("이미 신청한 사용자입니다.");
    }

    if (lectureRepository.countRegisteredParticipants() >= 30) {
      throw new IllegalStateException("이미 최대 인원에 도달했습니다.");
    }

    LectureModel lectureModel1 = new LectureModel("특강 제목", currentDate.of(2024, 4, 20, 13, 0));
    lectureRepository.save(LectureModel);
  }
//  public static boolean checkLectureStatus(String userId) {
//    return registrationFlag = true;
//  }
//  public LectureService lectureService;
//  public LectureService(LectureService lectureService) {
//    this.lectureService = lectureService;
//  }
//
//  public void applyForSeminar(String userId) {
//    LectureService.applyForLecture(userId);
//  }
//
//  public static void applyForLecture(String userId) {
//  }
//
//  public boolean checkSeminarStatus(String userId) {
//    return LectureService.checkLectureStatus(userId);
//  }




}
