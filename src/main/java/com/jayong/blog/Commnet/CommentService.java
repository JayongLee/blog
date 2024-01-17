package com.jayong.blog.Commnet;

import com.jayong.blog.Mylog.Mylog;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@RequiredArgsConstructor
@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public void create(Mylog mylog, String content) {
        Comment comment = new Comment();
        comment.setContent(content);
        comment.setCreateDate(LocalDateTime.now());
        comment.setMylog(mylog);
        this.commentRepository.save(comment);
    }
}
