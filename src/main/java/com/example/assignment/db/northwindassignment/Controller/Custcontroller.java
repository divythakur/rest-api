package com.example.assignment.db.northwindassignment.Controller;

import com.example.assignment.db.northwindassignment.Model.Customers;
import com.example.assignment.db.northwindassignment.repository.Custrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class Custcontroller {
    @Autowired
    private Custrepo dao;
    @RequestMapping("/hi")
    @ResponseBody
    public String hithere() {

        return "helllllo";
    }

    @PostMapping("/addCustomers")
    public String addCustomers(@RequestBody List<Customers> Customers) {
        dao.saveAll( Customers);
        return "hi";
    }

    @GetMapping("/getAll")
    public List<Customers> getCustomers() {
        return (List<Customers>) dao.findAll();
    }

    @GetMapping("/getCustomer/{id}")
    public Optional<Customers> getone(@PathVariable String id)
    {
        return dao.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable String id)
    {
        dao.deleteById(id);
    }

}


