/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio494;

/**
 *
 * @author yan-l
 */
public class Troca {
    public static void troca(String[] arr, int n1, int n2) {
        String aux = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = aux;
    }
}
