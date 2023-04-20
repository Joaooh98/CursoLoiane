package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.domain.Vetor;

public class Aula03 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);

        // vetor.adicionar("elemento 01");
        // vetor.adicionar("elemento 02");
        try {
            vetor.to_add("elemento");
            vetor.to_add("elemento");
            vetor.to_add("elemento");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
