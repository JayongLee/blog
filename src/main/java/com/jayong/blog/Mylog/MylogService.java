package com.jayong.blog.Mylog;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MylogService {
    // 엔티티 클래스를 대체할 DTO 클래스 만들기 권장
    private final MylogRepository mylogRepository;

    public List<Mylog> getList(){
        return this.mylogRepository.findAll();
    }
}
