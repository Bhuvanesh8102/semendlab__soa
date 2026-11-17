
package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ms1")
public class MS1Controller {

    @GetMapping("/add")
    public String add(
            @RequestParam(name = "a") int a,
            @RequestParam(name = "b") int b) {

        int sum = a + b;

        return "MS 1.1 - Additon = " + sum;
    }
}
