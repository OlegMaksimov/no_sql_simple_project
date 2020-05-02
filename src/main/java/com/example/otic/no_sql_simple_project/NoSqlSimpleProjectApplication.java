package com.example.otic.no_sql_simple_project;

import com.example.otic.no_sql_simple_project.domain.Customer;
import com.example.otic.no_sql_simple_project.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class NoSqlSimpleProjectApplication {


    public static void main(String[] args) {
        SpringApplication.run(NoSqlSimpleProjectApplication.class, args);

    }

}
