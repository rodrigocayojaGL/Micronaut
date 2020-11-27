package com.example.controller;


import com.example.service.ServiceCursos;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;
import java.util.List;

@Controller("/sf")
public class ControllerCursos {

    @Inject
    private ServiceCursos service;

    @Get("/cursos")
    public List<String> helloMicronaut() {
        return service.cursos();
    }

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }



}