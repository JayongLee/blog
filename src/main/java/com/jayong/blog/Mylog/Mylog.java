package com.jayong.blog.Mylog;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

import com.jayong.blog.Commnet.Comment;
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

        @OneToMany(mappedBy = "mylog", cascade = CascadeType.REMOVE)
        private List<Comment> commentList;

        private LocalDateTime createDate;
}
