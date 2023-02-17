package com.ntt.demo2.controller;

import com.ntt.demo2.domain.Canale;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CanaleController {
    @GetMapping("/canale")
    public ResponseEntity<Canale> returnCanale(){
        Canale canale = new Canale();
        canale.setNome("Italia 1");
        canale.setNumero(6);
        return new ResponseEntity<>(canale, HttpStatus.OK);
    }

    @PostMapping("/canale")
    public ResponseEntity<?> createCanale(@RequestBody Canale canale){
        Canale canale1 = canale;
        return new ResponseEntity<>(canale1, HttpStatus.CREATED);
    }
}
