package com.email.writer;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/email")
@RestController

public class EmailGeneratorController {
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest) {
        return ResponseEntity.ok("");
    }

}
