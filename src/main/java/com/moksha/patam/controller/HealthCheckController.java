package com.moksha.patam.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@Log4j2
public class HealthCheckController {
    @GetMapping("/ping")
    public ResponseEntity<?> ping() {
        return new ResponseEntity<>("PONG", HttpStatus.OK);
    }

}
