package com.example.singleton;

import org.springframework.stereotype.Component;

@Component
public class SingletonComponent {

    public SingletonComponent() {
        System.out.println("싱글톤 컴포넌트 생성!");
    }

    public void logic() {
        System.out.println("로직 수행");
    }
}
