package com.example.DiIoCAop.config;

import com.example.DiIoCAop.member.MemberRepository;
import com.example.DiIoCAop.member.MemberService;
import com.example.DiIoCAop.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository(); //의존성 주입 - DI
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository()); // DI
    }
}
