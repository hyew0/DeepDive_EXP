package com.example.transaction.service;

import com.example.transaction.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void test_success() {
        memberService.registerMember("honggildong", false);
        assertEquals(1, memberRepository.count());
    }

    @Test
    void test_fail_rollback() {
        assertThrows(RuntimeException.class,() -> {
            memberService.registerMember("gildonggildong", true);
        });
        assertEquals(0, memberRepository.count()); // 롤백되어야 count == 0 -> 저장되지 않았다는 뜻.
    }
}