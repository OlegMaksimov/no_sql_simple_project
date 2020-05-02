package com.example.otic.no_sql_simple_project.repository;

import com.example.otic.no_sql_simple_project.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer,String> {

  Customer findByFirstName(String firstName);
  List<Customer> findByLastName(String lastName);
}
