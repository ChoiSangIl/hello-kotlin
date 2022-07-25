package com.example.hellokotlin.controller.member

import com.example.hellokotlin.dto.MemberKotlinDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberKotlinController {
    @GetMapping("/save/kotlin/member")
    fun saveMember(memberDto: MemberKotlinDto): String {
        return memberDto.toString();
    }
}