//package com.email.writer;  // Your package
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.reactive.function.client.WebClient;
//
//@Configuration  // Marks this class as a configuration class
//public class WebClientConfig {
//
//    @Bean  // Tells Spring to treat this method as a bean definition
//    public WebClient webClient() {
//        return WebClient.builder()
//                .baseUrl("https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key=GEMINI_API_KEY")  // Set your default API URL
//                .build();
//    }
//}
