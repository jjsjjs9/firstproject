package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleFormDto;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
@Slf4j  // 로깅을 위한 애너테이션
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleFormDto form) {

        //1. dto-> entity로 변환.
        Article article = form.toEntity();
        log.info(form.toString());
        //2. repository에게 엔티티를 db안에 저장하게 함.
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
        return "";
    }

    @GetMapping("/articles/{id}")
    public String show(@PathVariable Long id, Model model) {
        log.info("id = " + id);
        Article articleEntity = articleRepository.findById(id).orElse(null);//1. id를 조회해 데이터를 가져온다.
        model.addAttribute("article", articleEntity);//2. 모델에 데이터를 등록.
        return "articles/show";     //3. 뷰 페이지로 반환.
        return "";
    }
}
