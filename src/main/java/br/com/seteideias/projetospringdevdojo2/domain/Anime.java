package br.com.seteideias.projetospringdevdojo2.domain;

import lombok.Data;

@Data
public class Anime {

    private long id;
    private String name;

    public Anime(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
