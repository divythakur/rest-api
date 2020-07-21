package com.example.assignment.db.northwindassignment.repository;

import com.example.assignment.db.northwindassignment.Model.Products;
import org.springframework.data.repository.CrudRepository;

public interface Productrepository extends CrudRepository<Products,Integer> {

}
