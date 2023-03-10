package com.shoppingMall.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafExController {
    @GetMapping("/ex01")
    public String thymeleafExample01(Model model){
        model.addAttribute("data", "타임리프 예제 입니다.");
        return "thymelefEx/thymeleafEx01";
    }
}
