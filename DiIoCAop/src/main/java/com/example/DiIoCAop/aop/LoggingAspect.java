package com.example.DiIoCAop.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.example.DiIoCAop.member.MemberService.join(..))")
    public void logBeforeJoin() {
        System.out.println("[LOG] 회원 가입 시작");
    }

    @AfterReturning("execution(* com.example.DiIoCAop.member.MemberService.join(..))")
    public void logAfterJoin() {
        System.out.println("[LOG] 회원 가입 완료");
    }
}
