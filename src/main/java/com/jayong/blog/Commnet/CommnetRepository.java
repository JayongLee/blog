package com.jayong.blog.Commnet;

import com.jayong.blog.Commnet.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommnetRepository extends JpaRepository<Comment, Integer> {
}
