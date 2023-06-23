package com.loiane.estruturadados.vetor.testeVetor;

import com.loiane.estruturadados.vetor.domain.Vetor;

public class Aula05 {
    public static void main(String[] args) {
          
        var vetor = new Vetor(10);

        vetor.toAdd("elemento 01");
        vetor.toAdd("elemento 02");
        vetor.toAdd("elemento 03");

        System.out.println(vetor.busca(0));
        System.out.println(vetor.busca(15)); // representa uma execeção
    }
}