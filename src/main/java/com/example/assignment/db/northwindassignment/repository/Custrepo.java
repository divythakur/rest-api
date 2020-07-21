package com.example.assignment.db.northwindassignment.repository;

import com.example.assignment.db.northwindassignment.Model.customer;
import org.springframework.data.repository.CrudRepository;

public interface Custrepo extends CrudRepository<customer,String> {

}
