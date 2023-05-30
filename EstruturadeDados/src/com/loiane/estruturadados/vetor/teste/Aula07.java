package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.domain.Vetor;

public class Aula07 {
    public static void main(String[] args) {
        var vetor = new Vetor(10);

        vetor.toAdd("B");
        vetor.toAdd("C");
        vetor.toAdd("E");
        vetor.toAdd("F");
        vetor.toAdd("G");
        
        System.out.println(vetor);

        vetor.toAdic(0, "A");

        System.out.println(vetor);

    }
}
