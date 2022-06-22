package com.example.gooodbye;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.List;

@RestController
@RequestMapping("api/farewell")
public class FarewellController {
    @GetMapping("/{name}")
    public String goodBye(@PathVariable String name) {
       String[] farewellOptions = {"Adieu","Adios","See you later","au revoir"};
       int index = (int)(Math.random() * 5) ;
        return farewellOptions[index] + " " + name + "!";
    }

}