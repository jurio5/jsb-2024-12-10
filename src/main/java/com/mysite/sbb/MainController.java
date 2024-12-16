package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    // GET http://localhost:8080/
    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }

    // GET http://localhost:8080/sbb
    @GetMapping("/sbb")
    @ResponseBody
    public String about() {
        return "안녕하세요 sbb에 오신것을 환영합니다.";
    }
    // 일반 메서드는 클라이언트가 직접 호출할 수 없음
    public void contact() {
        System.out.println("contact");
    }

}