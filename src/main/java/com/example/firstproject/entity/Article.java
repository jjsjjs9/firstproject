package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Entity     // 엔티티 선언
public class Article {

    @Id     // 엔티티 대표값 지정
    @GeneratedValue // 숫자 자동 부여
    private Long id;
    @Column // db테이블의 타이틀과 연동
    private String title;
    @Column // db테이블에 컨텐트와 연동.
    private String content;
}

