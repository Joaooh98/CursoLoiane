package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.domain.Vetor;

public class Aula04 {
    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(10);

        vetor.to_add("elemento 01");
        vetor.to_add("elemento 02");
        vetor.to_add("elemento 03");

        System.out.println(vetor.tamanho());

        System.out.println(vetor.toString());
    }
}
