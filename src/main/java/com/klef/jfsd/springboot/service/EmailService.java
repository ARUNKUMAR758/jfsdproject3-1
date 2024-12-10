//package com.klef.jfsd.springboot.service;
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EmailService {
//
//    private final JavaMailSender javaMailSender;
//
//    @Autowired
//    public EmailService(JavaMailSender javaMailSender) {
//        this.javaMailSender = javaMailSender;
//    }
//
//    public void sendSimpleEmail(String to, String subject, String text) {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("sainarenreddypoothi2005@gmail.com"); // or use a variable for dynamic email
//        message.setTo(to);
//        message.setSubject(subject);
//        message.setText(text);
//
//        javaMailSender.send(message);
//    }
//}
