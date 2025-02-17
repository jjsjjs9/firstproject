package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor      // 디폴트 생성자를 추가하는 애너테이션
@ToString
@Entity     // 엔티티 선언
@Getter
public class Article {

    @Id     // 엔티티 대표값 지정
    @GeneratedValue // 숫자 자동 부여
    private Long id;
    @Column // db테이블의 타이틀과 연동
    private String title;
    @Column // db테이블에 컨텐트와 연동.
    private String content;

}

