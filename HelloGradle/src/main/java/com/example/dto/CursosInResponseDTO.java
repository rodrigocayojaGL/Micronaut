package com.example.dto;

import java.util.ArrayList;
import java.util.Collection;

public class CursosInResponseDTO {
    private Collection<Cursos> cursos;

    public Collection<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(Collection<Cursos> cursos) {
        this.cursos = cursos;
    }

    public CursosInResponseDTO() {
        this.cursos = new ArrayList<>();
    }
    public void add(Cursos cursos){
        this.cursos.add(cursos);

    }
}
