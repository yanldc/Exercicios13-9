/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio490;

/**
 *
 * @author yan-l
 */
public class Rest {
    void restantes(String[] vet, String x) {
        int i;
        int tam = vet.length;

        for (i = 0; i < tam; i++) {
            vet[i] = vet[i].replaceAll(x, "*");
        }
    }
}
