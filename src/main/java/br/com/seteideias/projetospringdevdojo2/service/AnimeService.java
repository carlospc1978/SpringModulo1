package br.com.seteideias.projetospringdevdojo2.service;

import br.com.seteideias.projetospringdevdojo2.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

    public List<Anime> listAll(){
        return List.of(new Anime(1,"He-man"),new Anime(2,"She-haa"),new Anime(3,"ThunderCats"));
    }

}
