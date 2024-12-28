package com.example.firstproject.controller;

import com.example.firstproject.dto.MemberForm;
import com.example.firstproject.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.lang.reflect.Member;

@Controller
@Slf4j
public class MemberController {
    @Autowired
    MemberRepository memberRepository;

    @GetMapping("/join")
    public String signupPage(){
        return "members/new";
    }

    @PostMapping("/join")
    public String join(MemberForm memberForm){

        //Member member = memberForm.toEntity();
        log.info(memberForm.toString());

        //Member saved = memberRepository.save(member);
        //log.info(saved.toString());
        return "";
    }
}
