package com.jkh.GradleTest2.controller;

        import com.jkh.GradleTest2.service.InMemoryProductService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;

        import java.util.HashMap;
        import java.util.Map;

@Controller
public class UIController {
    @Autowired
    InMemoryProductService inMemoryProductService;

    @RequestMapping("/th")
    public String teplatePage(Model model) {
        model.addAttribute("message", "boot template!");
        return "th";
    }

    @RequestMapping("/th2")
    public String templatePage2(Model model) {
        Map<String, Object> pageMap = new HashMap<>();
        pageMap.put("color", "red");
        pageMap.put("name", "jkh");
        pageMap.put("price", 4000);
        model.addAttribute("product", pageMap);
        return "th2";
    }

    @RequestMapping("/th3")
    public String templatePage3(Model model) {
        model.addAttribute("products", inMemoryProductService.getProductList());
        return "th3";
    }

    @RequestMapping("/home")
    public String templateHome() {
        return "home";
    }
}
