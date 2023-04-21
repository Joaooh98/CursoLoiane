package com.loiane.estruturadados.vetor.domain;

import java.util.Arrays;

import javax.swing.text.Position;

public class Vetor {
    private String [] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;

    }

    public boolean to_add(String elemento) {
        if (this.tamanho < this.elementos.length){
             this.elementos[this.tamanho] = elemento;
             this.tamanho++;
            //  System.out.println(elemento);
             return true;
        }
        System.out.println("vetor ja esta cheio");
        return false;
    }
    
    // public void adicionar(String elemento) {
    //     for (int i = 0; i < elementos.length; i++) {
    //         if (this.elementos[i] == null) {
    //             this.elementos[i] = elemento;
    //             System.out.println(elemento);
    //             break;
    //         }
    //     }
    // }

    // public void to_add(String elemento) throws Exception{
    //     if (this.tamanho < this.elementos.length){
    //         this.elementos[this.tamanho]= elemento;
    //         this.tamanho++;
    //         System.out.println(elemento);
    //     }else{
    //         throw new Exception("Vetor ja esta cheio, nao e possivel adicionar mais elementos");
    //     }
    public String busca(int posicao){
        if(!(posicao>=0 && posicao < tamanho)){
            throw new IllegalArgumentException("posição invalida");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento){
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }            
        }
        return -1;
    }

    public int tamanho(){
        return this.tamanho;
        
        }
    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");
                
        for (int i = 0; i < tamanho-1; i++) {
            s.append (this.elementos[i]);
            s.append (", ");
        }
            if(this.tamanho>0){
                s.append (this.elementos[this.tamanho-1]);
        }
            s.append("]");

        return s.toString();
    }
      
    }
