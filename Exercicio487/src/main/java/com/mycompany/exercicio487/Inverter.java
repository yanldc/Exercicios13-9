/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio487;

/**
 *
 * @author yan-l
 */
public class Inverter {
    void inverte(int[] vet) {
        int max = vet.length;
        int k, i, aux;
        k = max;
       
        for (i = 0; i < max / 2; i++) {
            k--;
            aux = vet[i];
            vet[i] = vet[k];
            vet[k] = aux;
        }
    }
}
