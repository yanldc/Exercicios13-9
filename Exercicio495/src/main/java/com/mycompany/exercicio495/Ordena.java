/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio495;

/**
 *
 * @author yan-l
 */
public class Ordena {
    void ordena(String vet[], int tam){
        int l1, c1;
        String aux;
        
        for(l1=0; l1<tam; l1++){
            for(c1= l1+1; c1<tam; c1++){
                if (vet[l1].compareTo(vet[c1]) > 0){
                    aux = vet[l1]; vet[l1] = vet[c1]; vet[c1] = aux;
                }
            }
        }
        
    }
}
