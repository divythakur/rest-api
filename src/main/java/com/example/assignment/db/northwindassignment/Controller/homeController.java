package com.example.assignment.db.northwindassignment.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
@RequestMapping("/")
    public String homepage()
  {
      return "Welcome  to   the   page   :-   As per  cloud   Condition   . Due to   Size  limitation  Some of the Data can be missed   so   plz ignore if there is mismatch with actual dataset  ..   THANK YOU";

   }

}
