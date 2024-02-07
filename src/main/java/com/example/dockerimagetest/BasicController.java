package com.example.dockerimagetest;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class BasicController {


    @GetMapping
    public ResponseEntity<String> all(
    ) {
        return ResponseEntity.ok("congratulation basic controller information access");
    }


}
