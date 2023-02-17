package com.ntt.demo2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.ArrayList;

@Data
@AllArgsConstructor

public class Tv extends Monitor {
    private ArrayList<Canale> listaCanale = new ArrayList<Canale>();
    private LocalTime ora = LocalTime.now();

    public Tv(){

    }

    public Tv(String colore, String marca, ArrayList<Canale> listaCanale, LocalTime ora) {
        super(colore, marca);
        this.listaCanale = listaCanale;
        this.ora = ora;
    }

    public void rimuoviCanale(String nome){
        for(int i=0; i < listaCanale.size(); i++){
            if(listaCanale.get(i).getNome().equals(nome)){
                listaCanale.remove(i);
            }

        }
    }
    public void aggiungiCanale(String nome, int i){
        listaCanale.add(new Canale(nome, i, false ));
    }

    public String info(){
        for (Canale canale:listaCanale
        ) {
            if(canale.isStato()){
                return canale.toString();
            }
        }
        return null;
    }

    public void risintonizza(){
        Canale canale = listaCanale.get(0);
        canale.setStato(true);
        listaCanale.set(0, canale);
        for(int i = 1; i < listaCanale.size(); i++){
            canale = listaCanale.get(i);
            canale.setStato(false);
            listaCanale.set(i, canale);
        }}


    public void attivazioneTv() {
        for (Canale canale: this.listaCanale
        ) {
            canale.setStato(false);
        }
        listaCanale.get(0).setStato(true);
    }


    public void attivaAdUnOra(LocalTime ora) {

        if(this.ora == ora){
            attivazioneTv();
            System.out.println("Hai acceso la tv, campione");
        }
    }
}
