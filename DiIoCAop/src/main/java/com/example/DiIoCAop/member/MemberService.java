package com.example.DiIoCAop.member;

public class MemberService {
    private final MemberRepository memberRepository;

    //생성자 주입 - DI
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void join(Member member) {
        memberRepository.save(member);
    }

    public Member findMember(Long id) {
        return memberRepository.findById(id).orElse(null);
    }
}
