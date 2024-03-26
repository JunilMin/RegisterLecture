package com.example.repository;

import com.example.model.LectureModel;

public interface LectureRepository {
  void save(LectureModel lectureModel);
  int countRegisteredParticipants();
  boolean isAlreadyRegistered(String userId);
}
