package com.example.model;
import java.util.Date;

public class LectureModel {
  public int userId; //학생 Id
  public int lectureId; //특강의 고유 식별자
  public boolean registrationFlag; // 등록 여부
  public String title; // 강의 제목
  public int capacity = 30; // 수용 인원
  public int registeredStudents; // 등록된 학생 by Id
  Date currentDate = new Date();


}
