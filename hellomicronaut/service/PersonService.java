package com.example.hellomicronaut.service;

import com.example.hellomicronaut.entity.PersonDTO;

public interface PersonService {
    public PersonDTO getPerson(String name);
}
