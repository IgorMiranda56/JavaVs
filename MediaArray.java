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
public class MediaArray {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        double[] notas = new double[2];
               
        for(int i = 0; i < 2; i++){
            do{
                System.out.println("Digite a " + (i + 1) + "ª nota: ");
                notas[i] = pergunta.nextDouble();
                
            }while(notas[i] < 0 || notas[i] > 10);
            }
        
            System.out.println("\nNotas inseridas:");
        for(double nota : notas){
            System.out.println("Nota: " + nota);
        }
    }
}
