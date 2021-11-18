package com.example.clinica_odontologica_2.model;


import com.example.clinica_odontologica_2.dto.DentistaDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dentista {
    private Integer id;
    private String nome;
    private String sobrenome;
    private String matricula;

    public Dentista() {
    }

    public Dentista(DentistaDTO dentistaDTO) {
        this.id = dentistaDTO.getId();
        this.nome = dentistaDTO.getNome();
        this.sobrenome = dentistaDTO.getSobrenome();
        this.matricula = dentistaDTO.getMatricula();


    }
}