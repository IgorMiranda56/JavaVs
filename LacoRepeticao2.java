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
public class LacoRepeticao2 {
    public static void main(String[] args) {
        
        for (int i = 0; i<5; i++){
            System.out.println("Valor de i: " + i);
        }
        
        Scanner pergunta = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        int idade = pergunta.nextInt();
        
        while(idade < 18){
            System.out.println("Acesso negado.");
            System.out.println("Digite sua idade: ");
            idade = pergunta.nextByte();
        }
        
        System.out.println("Acesso permiotido. ");
        System.out.println("Carregando... ");
        
        int avaliacao;
        
        do {
            System.out.println("Avalie nosso atedimento, de 1 a 5 estrelas: ");
            avaliacao = pergunta.nextInt();
        }while(avaliacao < 1 || avaliacao > 5);
        
        System.out.println("Obrigado! ");
        
    }
}
