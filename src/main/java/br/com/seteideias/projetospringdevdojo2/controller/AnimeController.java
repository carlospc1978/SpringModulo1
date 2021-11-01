package br.com.seteideias.projetospringdevdojo2.controller;


import br.com.seteideias.projetospringdevdojo2.domain.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {

    @GetMapping(path = "list")
    public List<Anime> list(){
        return List.of(new Anime("He-man"),new Anime("She-ha"));
    }

    @GetMapping(path = "teste")
    public String textoInicial(){
        return "<html>Texto de <b>exemplo</b></html>";
    }

}
