package com.azure.ubscase.controller;

import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.classic.Logger;

@Controller
public class IteratorController {
	
	Logger logger = (Logger)LoggerFactory.getLogger(IteratorController.class);
	
    @RequestMapping("/dummy")
    public ResponseEntity<Object> index() {

        
        for(int i = 1; i<=100; i++){
        		logger.warn("iteration number > " +i);
        }

        return ResponseEntity.ok("code run successfully");
    }
    
    
    @RequestMapping("/")
    public ResponseEntity<Object> root() {

        
    		logger.warn("Application started successfully!");

        return ResponseEntity.ok("Application started successfully");
    }

}
