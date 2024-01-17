package com.jayong.blog.Commnet;

import com.jayong.blog.Mylog.Mylog;
import com.jayong.blog.Mylog.MylogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/comment")
@RequiredArgsConstructor
@Controller
public class CommentController {

    private final MylogService mylogService;
    private final CommentService commentService;

    @PostMapping("/create/{id}")
    public String createComment(Model model, @PathVariable("id") Integer id, @RequestParam(value="content") String content) {
        Mylog mylog = this.mylogService.getMylog(id);
        this.commentService.create(mylog, content);
        // return String.format("redirect:/mylog/detail/%s", id);
        return "redirect:/mylog/list";
    }

}
