package com.jayong.blog.Mylog;

import java.util.List;

import org.springframework.stereotype.Service;
import java.util.Optional;
import com.jayong.blog.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class MylogService {
    // 엔티티 클래스를 대체할 DTO 클래스 만들기 권장
    private final MylogRepository mylogRepository;

    public List<Mylog> getList(){

        return this.mylogRepository.findAll();
    }

    public Mylog getMylog(Integer id) {
        Optional<Mylog> mylog = this.mylogRepository.findById(id);
        if (mylog.isPresent()) {
            return mylog.get();
        } else {
            throw new DataNotFoundException("question not found");
        }
    }

    public void create(String subject, String content) {
        Mylog my = new Mylog();
        my.setSubject(subject);
        my.setContent(content);
        my.setCreateDate(LocalDateTime.now());
        this.mylogRepository.save(my);
    }
}
