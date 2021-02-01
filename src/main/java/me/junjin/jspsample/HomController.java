package me.junjin.jspsample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomController {

    @GetMapping("/jsp/{name}")
    public String home(@PathVariable String name, Model model) {
        model.addAttribute("message", "hi");
        return name;
    }
}
