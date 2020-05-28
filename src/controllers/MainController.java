package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/convert")
    public String convert(@RequestParam float f, Model model) {
        model.addAttribute("f", f);
        return "index";
    }
}
