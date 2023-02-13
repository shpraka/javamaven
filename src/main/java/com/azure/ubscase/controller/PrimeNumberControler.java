package com.azure.ubscase.controller;




import java.util.ArrayList;

import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.classic.Logger;



@Controller
public class PrimeNumberControler {
	
	Logger logger = (Logger)LoggerFactory.getLogger(PrimeNumberControler.class);
	
    @RequestMapping("/primenumber")
    public ResponseEntity<Object> index() {

        
        primeList(2, 1000000);

        return ResponseEntity.ok("it worked!");
    }
    
    public void primeList(int firstnumber, int lastnumber) {
    	

    	for(int i = firstnumber; i <= lastnumber; i++){ 
    		if(isPrime(i)) {
    			 logger.warn("Prime Number: " + i);
   			 
    		}
    	}

    	
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) {  
            return false;  
        }  
        for (int i = 2; i <= Math.sqrt(n); i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    }  
 }

