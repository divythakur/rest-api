package com.example.assignment.db.northwindassignment.Controller;

import com.example.assignment.db.northwindassignment.Model.Orders;
import com.example.assignment.db.northwindassignment.Model.customer;
import com.example.assignment.db.northwindassignment.repository.OrderRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/getAll")
    public List<Orders> getall()
    {
        return (List<Orders>) orderRepository.findAll();
    }

    @GetMapping("/customer/{id}/order")
    public List<Orders> getOrders(@PathVariable String id) {
        List<Orders> order = new ArrayList<>();
        List<Orders> result = new ArrayList<>();
        order = (List<Orders>) orderRepository.findAll();
        for (Orders o : order) {
            if (o.getCustomer_Id().equals(id)) {
                result.add(o);
            }
        }
        return result;
    }


}
