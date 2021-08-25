package com.example.msaapp01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app01")
public class MsaAppController {

    @GetMapping("/welcome")
    public String welcome() {
        return "App01 : Hello World";
    }
}
