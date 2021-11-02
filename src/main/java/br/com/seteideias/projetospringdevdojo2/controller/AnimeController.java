package br.com.seteideias.projetospringdevdojo2.controller;

import br.com.seteideias.projetospringdevdojo2.domain.Anime;
import br.com.seteideias.projetospringdevdojo2.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    private final DateUtil dateUtil;

    @GetMapping//(path = "list")
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
        return List.of(new Anime("He-man"),new Anime("She-haa"),new Anime("ThunderCats"));
    }

    @GetMapping(path = "teste")
    public String textoInicial(){
        return "<html>Texto de <b>exemplo</b></html>";
    }

}
