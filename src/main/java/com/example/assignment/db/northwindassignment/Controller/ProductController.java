package com.example.assignment.db.northwindassignment.Controller;

import com.example.assignment.db.northwindassignment.Model.Products;
import com.example.assignment.db.northwindassignment.repository.Custrepo;
import com.example.assignment.db.northwindassignment.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private Productrepository dao;

    @PostMapping("/addProducts")
    public String addProducts(@RequestBody List<Products> products) {
        dao.saveAll( products);
        return "hi";


    }

    @GetMapping("/getAll")
        public List<Products> getProducts() {
        return (List<Products>) dao.findAll();
    }
    @GetMapping("/getProduct/{id}")
    public Optional<Products> getone(@PathVariable Integer id)
    {
        return dao.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Integer id)
    {
        dao.deleteById(id);
    }
    @PutMapping("/update/{id}")
    public String updateCustomers(@RequestBody Products product,@PathVariable String id)
    {
        dao.save(product);
        return "updated";
    }
}
