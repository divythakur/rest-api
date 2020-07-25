package com.example.assignment.db.northwindassignment.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home()
    {
        return "WELCOME . Note:-Use POST method and  DELETE method in postman instead of browser   CHECK the API Documentation to  use the API's";
    }
}
