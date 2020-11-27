package com.example.service;

import com.example.dto.Cursos;
import com.example.dto.CursosInResponseDTO;
import com.example.dto.Tag;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class ServiceCursos {

    public CursosInResponseDTO cursos(){
        CursosInResponseDTO cursos = new CursosInResponseDTO();
        Cursos curso = new Cursos();
        curso.setDescripcion("lenguaje de java");
        curso.setLink("http://java.com");
        List<Tag> listTag;
        curso.setTags(listTag);
        cursos.add(curso);
        return cursos;
    }
}
