package com.example.demo.controller;


import com.example.demo.dto.Students;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.Year;

@RestController
public class PostTestController {

    @RequestMapping(value = "/test/postmethod/json", method = RequestMethod.POST, consumes = "application/json")
    public String GetData(@RequestBody Students students) {
        int year = Year.now().getValue();
        int birthYear = year - students.getAge();
        return "Student name is : " + students.getName() + ", " + " Birth Year : " + birthYear + ".";
    }
}
