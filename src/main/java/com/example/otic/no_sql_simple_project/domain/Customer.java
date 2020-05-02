package com.example.otic.no_sql_simple_project.domain;

import lombok.AccessLevel;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Customer {

    @Id
    String id;

    String firstName;
    String lastName;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
