/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class lojaMamaoComAcucar {
    public static void main(String[] args) {
        Scanner perguntaValor = new Scanner(System.in);
        
        System.out.println("Digite o valor da compra: ");
        double valor = perguntaValor.nextDouble();
        
        double parcelas = valor / 5;
        
        System.out.println("Loja Mamão com Açúcar");
        System.out.println("Parcelas: " + parcelas);
        
        perguntaValor.close();
    }

}
