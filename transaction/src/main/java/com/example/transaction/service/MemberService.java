package com.example.transaction.service;

import com.example.transaction.entity.Member;
import com.example.transaction.repository.MemberRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Transactional
    public void registerMember(String name, boolean throwError) {
        Member member = new Member();
        member.setName(name);
        memberRepository.save(member);

        if (throwError) {
            throw new RuntimeException("error 발생 -> 롤백 실행");
        }
    }
}
