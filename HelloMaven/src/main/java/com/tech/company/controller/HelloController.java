package com.example.hellomicronaut.controller;

import com.example.hellomicronaut.entity.PersonDTO;
import com.example.hellomicronaut.service.PersonService;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {

    private PersonService personService;

    public HelloController(PersonService personService) {
        this.personService = personService;
    }

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }

    @Get("/micronaut")
    public String helloMicronaut() {
        return "Hello, Micronaut!";
    }

    @Get("/person")
    public PersonDTO getNamePerson() {
        final PersonDTO personResponse = personService.getPerson("Rodrigo");
        return personResponse;
    }
}