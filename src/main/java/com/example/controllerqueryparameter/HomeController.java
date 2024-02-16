package com.example.controllerqueryparameter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/v1")

public class HomeController {
    @GetMapping("/ciao")
    public String ciao(@RequestParam String nome, @RequestParam String provincia) {
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }
    //localhost:8080/v1/ciao?nome=Giuseppe&provincia=Lombardia

    @GetMapping("/annoDiNascita")
    public Integer annoDiNascita(@RequestParam String annoNascita) {
        LocalDate annoCorrente = LocalDate.now();
        LocalDate dataDiNascita = LocalDate.parse(annoNascita);
        Integer eta =(annoCorrente.getYear() - dataDiNascita.getYear());
        return eta;
    }
    //localhost:8080/v1/annoDiNascita?annoDiNascita=1997-09-28
}
