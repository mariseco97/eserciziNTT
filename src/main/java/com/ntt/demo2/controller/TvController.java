package com.ntt.demo2.controller;

import com.ntt.demo2.domain.Canale;
import com.ntt.demo2.domain.Monitor;
import com.ntt.demo2.domain.Tv;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.ArrayList;

@RestController
@RequestMapping("/tv")
public class TvController {
    @GetMapping()
    public ResponseEntity<Tv> returnTv() {
        Tv tv = new Tv();
        tv.setColore("Nero");
        tv.setMarca("Samsung");
        return new ResponseEntity<>(tv, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> createTv(@RequestBody Tv tv) {
        Tv tv1 = tv;
        return new ResponseEntity<>(tv1, HttpStatus.CREATED);
    }

    @PutMapping("/upd")
    public ResponseEntity<?> updateTv(@RequestBody Canale canale) {
        ArrayList<Canale> lista = new ArrayList<Canale>();
        lista.add(new Canale("canale 5", 5, false));
        Tv tv2 = new Tv(lista, LocalTime.now());
        tv2.aggiungiCanale(canale.getNome(), canale.getNumero());
        return new ResponseEntity<>(tv2, HttpStatus.OK);
    }

    @PutMapping("/ris")
    public ResponseEntity<?> updateRisintonizzaTv(@RequestBody Canale canale) {
        ArrayList<Canale> lista1 = new ArrayList<Canale>();
        lista1.add(new Canale("canale 5", 5, false));
        Tv tv2 = new Tv(lista1, LocalTime.now());
        tv2.risintonizza();
        return new ResponseEntity<>(tv2, HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity<Tv> deleteTv(@RequestBody String nome) {
        ArrayList<Canale> lista = new ArrayList<Canale>();
        lista.add(new Canale("Rai 1", 1, false));
        lista.add(new Canale("La 7", 7, false));
        Tv tv = new Tv();
        return new ResponseEntity<>(tv, HttpStatus.OK);
    }

}