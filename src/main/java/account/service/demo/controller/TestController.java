package account.service.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/main")
    public String main() {
        String str = "HELLO SPRING";
        return str;
    }
}
