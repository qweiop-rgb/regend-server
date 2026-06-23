package kr.hs.dgsw.cicd_springboot_01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping
    public String home() {
        int k = 0;
        int j = 0;
        return "Hello World-CICD01";
    }

}
