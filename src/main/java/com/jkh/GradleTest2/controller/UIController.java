package com.jkh.GradleTest2.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UIController {
    @RequestMapping("/th")
    public String teplatePage(Model model) {
        model.addAttribute("message", "boot template!");
        return "th";
    }
}
