package com.example.assignment.db.northwindassignment.Controller;

import com.example.assignment.db.northwindassignment.Model.Orders;
import com.example.assignment.db.northwindassignment.Model.customer;
import com.example.assignment.db.northwindassignment.repository.OrderRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@RestController
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;
    @GetMapping("/customer/{id}/order")
    public List<Orders> getOrders(@PathVariable String id) {
        List <Orders> order= new ArrayList<>();
        orderRepository.findByCustomerCustomerId(id)
                .forEach(order::add);
        return order;
    }
}
