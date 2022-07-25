package com.example.hellokotlin.controller.member;

import com.example.hellokotlin.dto.MemberJavaDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @GetMapping("/save/java/member")
    private String save(MemberJavaDto member){
        return member.toString();
    }
}
