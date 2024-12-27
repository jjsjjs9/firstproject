package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleFormDto;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j  // 로깅을 위한 골뱅이
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleFormDto form){

        //log.info(form.toString());
        System.out.println(form.toString()); // -> logging 기능으로 대체.
        //1. dto-> entity로 변환.
        //Article article = form.toEntity();
        //log.info(article.toString());
        //2. repository에게 엔티티를 db안에 저장하게 함.
       // Article saved = articleRepository.save(article);
        //log.info(saved.toString());
        return "";
    }
}
