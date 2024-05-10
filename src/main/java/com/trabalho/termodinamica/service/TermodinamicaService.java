package com.trabalho.termodinamica.service;

import com.trabalho.termodinamica.dto.CelsiusDTO;
import com.trabalho.termodinamica.dto.FahrenheitDTO;
import com.trabalho.termodinamica.dto.KelvinDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TermodinamicaService {

    public ResponseEntity<CelsiusDTO> converterCelsius(Double celsius) {
        CelsiusDTO celsiusDTO = new CelsiusDTO();
        celsiusDTO.setFahrenheit(celsius * 1.8 + 32);
        celsiusDTO.setKelvin(celsius + 273.15);
        return ResponseEntity.ok().body(celsiusDTO);
    }

    public ResponseEntity<FahrenheitDTO> converterFahrenheit(Double fahrenheit) {
        FahrenheitDTO fahrenheitDTO = new FahrenheitDTO();
        fahrenheitDTO.setCelsius((fahrenheit - 32) / 1.8);
        fahrenheitDTO.setKelvin((fahrenheit - 32) / 1.8 + 273.15);
        return ResponseEntity.ok().body(fahrenheitDTO);
    }

    public ResponseEntity<KelvinDTO> converterKelvin(Double kelvin) {
        KelvinDTO kelvinDTO = new KelvinDTO();
        kelvinDTO.setCelsius(kelvin - 273.15);
        kelvinDTO.setFahrenheit((kelvin - 273.15) * 1.8 + 32);
        return ResponseEntity.ok().body(kelvinDTO);
    }
}
