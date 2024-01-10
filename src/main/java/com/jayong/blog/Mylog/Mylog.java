package com.jayong.blog.Mylog;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Mylog {
        @Id // 고유 값
        @GeneratedValue(strategy = GenerationType.IDENTITY) // 번호 매김 (자동 1씩 증가)
        private Integer id;

        @Column(length = 200)
        // 제목
        private String subject;

        @Column(columnDefinition = "TEXT")
        // 내용
        private String content;

        private LocalDateTime createDate;
}
