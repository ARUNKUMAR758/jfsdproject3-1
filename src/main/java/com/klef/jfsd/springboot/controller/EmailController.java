//package com.klef.jfsd.springboot.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.klef.jfsd.springboot.service.EmailService;
//
//@RestController
//public class EmailController {
//
//    private final EmailService emailService;
//
//    @Autowired
//    public EmailController(EmailService emailService) {
//        this.emailService = emailService;
//    }
//
//    @GetMapping("/send-email")
//    public String sendEmail(@RequestParam String to,
//                            @RequestParam String subject,
//                            @RequestParam String text) {
//        emailService.sendSimpleEmail(to, subject, text);
//        return "Email sent successfully to " + to;
//    }
//}
