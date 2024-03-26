package com.example.service;

import com.example.model.LectureModel;
import com.example.repository.LectureRepository;
import java.util.Date;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LectureService {
  public LectureRepository lectureRepository;
  LectureModel lectureModel1;
  Date currentDate = new Date();

  public static void applyForLecture(String userId) {
  }

  public static boolean checkLectureStatus(String userId) {
  }

  public void applyForLecture(String userId) {
    if (lectureRepository.isAlreadyRegistered(userId)) {
      throw new IllegalArgumentException("이미 신청한 사용자입니다.");
    }

    if (lectureRepository.countRegisteredParticipants() >= 30) {
      throw new IllegalStateException("이미 최대 인원에 도달했습니다.");
    }

    LectureModel lectureModel1 = new LectureModel("특강 제목", currentDate.getTime());
    lectureRepository.save(lectureModel1);
  }
}
