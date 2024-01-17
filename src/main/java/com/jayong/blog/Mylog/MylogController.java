package com.jayong.blog.Mylog;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping(value = "/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {
        Mylog mylog = this.mylogService.getMylog(id);
        model.addAttribute("mylog", mylog);
        return "mylog_detail";
    }

    @GetMapping("/create")
    public String mylogCreate() {
        return "mylog_form";
    }

    @PostMapping("/create")
    public String mylogCreate(@RequestParam(value="subject") String subject, @RequestParam(value="content") String content) {
        this.mylogService.create(subject, content);
        return "redirect:/mylog/list";
    }
}
