package com.demo.board.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/test")
    public ResponseEntity<String> test() {
        String text = "이경도";
        Integer num = 0;

        return ResponseEntity.status(500).body(text);
    }
    
}
