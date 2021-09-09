package github.yeori.bootdummy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/dummy")
    public String pageMain() {
        System.out.println("[DUMMY]");
        return "index";
    }
    
}
