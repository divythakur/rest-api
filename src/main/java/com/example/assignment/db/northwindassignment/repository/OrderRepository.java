package com.example.assignment.db.northwindassignment.repository;

import com.example.assignment.db.northwindassignment.Model.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Orders,Integer> {
     public List<Orders> findByCustomerCustomerId(String id);
}
