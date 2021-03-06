package br.com.seteideias.projetospringdevdojo2.service;

import br.com.seteideias.projetospringdevdojo2.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AnimeService {

    private List<Anime> animes = List.of(new Anime(1L,"He-man"),new Anime(2L,"She-haa"),new Anime(3L,"ThunderCats"));

    public List<Anime> listAll(){
        return animes;
    }

    public Anime findById(long id){
        return animes.stream()
                .filter(n -> n.getId().equals(id))
                .findFirst()
                .orElseThrow(()->new ResponseStatusException(HttpStatus.BAD_REQUEST,"Anime not Found"))
                ;
    }

}
