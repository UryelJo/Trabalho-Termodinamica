package com.trabalho.termodinamica.resource;

import com.trabalho.termodinamica.dto.CelsiusDTO;
import com.trabalho.termodinamica.dto.FahrenheitDTO;
import com.trabalho.termodinamica.dto.KelvinDTO;
import com.trabalho.termodinamica.service.TermodinamicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/termodinamica")
public class TermodinamicaResource {

    private final TermodinamicaService termodinamicaService;

    @Autowired
    public TermodinamicaResource(TermodinamicaService termodinamicaService) {
        this.termodinamicaService = termodinamicaService;
    }

    @GetMapping("/celsius/{celsius}")
    public ResponseEntity<CelsiusDTO> converterCelsius(@PathVariable Double celsius) {
        return this.termodinamicaService.converterCelsius(celsius);
    }

    @GetMapping("/fahrenheit/{fahrenheit}")
    public ResponseEntity<FahrenheitDTO> converterFahrenheit(@PathVariable Double fahrenheit) {
        return this.termodinamicaService.converterFahrenheit(fahrenheit);
    }

    @GetMapping("/kelvin/{kelvin}")
    public ResponseEntity<KelvinDTO> converterKelvin(@PathVariable Double kelvin) {
        return this.termodinamicaService.converterKelvin(kelvin);
    }

}
