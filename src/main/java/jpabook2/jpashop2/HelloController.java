package jpabook2.jpashop2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    private String hello(Model model){
        model.addAttribute("data","hello!!!");
        return "hello";
    }
}
