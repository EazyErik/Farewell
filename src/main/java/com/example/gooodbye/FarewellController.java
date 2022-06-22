package com.example.gooodbye;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/farewell")
public class FarewellController {
    @GetMapping("/{name}")
    public String goodBye(@PathVariable String name) {
        return "Good bye " + name;
    }

}