package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
//import lombok.AllArgsConstructor;
import lombok.ToString;

 // 생성자의 리팩터링
//@ToString   // tostring의 리팩터링
public class ArticleFormDto {
    private String title;       // 제목 필드
    private String content;     // 내용 필드

    public ArticleFormDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

     @Override
     public String toString() {
         return "ArticleFormDto{" +
                 "title='" + title + '\'' +
                 ", content='" + content + '\'' +
                 '}';
     }

     public Article toEntity() {
        return new Article(null,title,content);
    }
}
