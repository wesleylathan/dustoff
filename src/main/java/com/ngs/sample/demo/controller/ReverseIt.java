package com.ngs.sample.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseIt {
    @GetMapping("/doit")
    public String doit(@RequestParam(value="theWord") String theWord){

        String reversed = new StringBuilder(theWord).reverse().toString();
        return reversed;
    }
}
