package br.com.seteideias.projetospringdevdojo2.repository;

import br.com.seteideias.projetospringdevdojo2.domain.Anime;

import java.util.List;


public interface AnimeRepository {

    List<Anime> listAll();

}
