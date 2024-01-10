package com.jayong.blog.Mylog;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import lombok.RequiredArgsConstructor;

@RequestMapping("/mylog")
@RequiredArgsConstructor
@Controller
public class MylogController {

    private final MylogRepository mylogRepository;
    private final MylogService mylogService;

    @GetMapping("/list")
    public String list(Model model){
        List<Mylog> mylogList = this.mylogService.getList();
        model.addAttribute("mylogList", mylogList);
        return "mylog_list";
    }
}
