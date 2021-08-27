package com.example.msaapp01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/app01")
public class MsaAppController {

    @GetMapping("/welcome")
    public String welcome() {
        return "App01 : Hello World";
    }

    @GetMapping("message")
    public String message(@RequestHeader("app01-gate-in") String gate) {
        log.info("app01-gate-in : {}", gate);
        return "Hello World in app01";
    }

    @GetMapping("check")
    public String check() {
        return "check in app01";
    }
}
