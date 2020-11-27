package com.example.service;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class Service {

    public List<String> cursos(){
        List<String> cursos= new ArrayList<>();
        cursos.add("JAVA");
        cursos.add("PYTHON");
        cursos.add("C");
        cursos.add("JAVA SCRIPT");
        return cursos;
    }
}
