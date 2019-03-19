package com.practice.mailservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class SendGridController {

    private SendGridEmailService sendGridEmailService;

    public SendGridController(SendGridEmailService service) {
        this.sendGridEmailService = service;
    }

    @GetMapping("/send-mail")
    public String sendMail() {
        sendGridEmailService.sendText("madhur@abc.com", "madhur@abc.com", "Email address verification", "Test mail");
        return "success";
    }
}
