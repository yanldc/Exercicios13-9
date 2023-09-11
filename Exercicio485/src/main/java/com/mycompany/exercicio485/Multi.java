/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio485;

/**
 *
 * @author yan-l
 */
public class Multi {
    static int multiVetor(int[] vet1, String[] vet2, int tam) {
        int total = 0;
        int i, w;

        for (i= 0; i < tam; i++) {
            System.out.println("");
            for (w = 0; w < vet1[i]; w++) {
                System.out.print(vet2[i]);
                total += vet1[i];
            }
        }
        return total; 
    }
}