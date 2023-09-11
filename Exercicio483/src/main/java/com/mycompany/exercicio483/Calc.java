/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio483;

/**
 *
 * @author yan-l
 */
class Calc {
    int produtoInterno(int[] vet1, int[] vet2, int qtd) {
        int prod = 0;
        
        for (int i = 0; i < qtd; i++) {
            prod = prod + (vet1[i] * vet2[i]);
        }
        return prod;
    }
}
