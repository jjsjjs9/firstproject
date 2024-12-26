package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor // 생성자의 리팩터링
@ToString   // tostring의 리팩터링
public class ArticleFormDto {
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(null,title,content);
    }
}
