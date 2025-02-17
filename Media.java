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
public class Media {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        
        String resultado;
        int divisaoMedia = 2;
                
        System.out.println("Digite o seu nome: ");
        String nomeAluno = pergunta.next();
        
        double primeiraNota;
        double segundaNota;
                
        do{
            System.out.println("Digite a primeira nota: ");
            primeiraNota = pergunta.nextDouble();
        }while(primeiraNota < 0 || primeiraNota > 10);
        
        do{
            System.out.println("Digite a segunda nota: ");
            segundaNota = pergunta.nextDouble();
        }while(segundaNota < 0 || segundaNota > 10);
        
        
        double media = (primeiraNota + segundaNota) / divisaoMedia;
        
        if (media >= 7){
            resultado = "Aprovado. ";
        }else if (media >= 5){
            resultado = "Verificação Suplementar. ";
        }else{
            resultado = "Reprovado. ";
        }
        
        System.out.println("Nome do Aluno: " + nomeAluno);
        System.out.println("Média do Aluno: " + media);
        System.out.println("Situação do Aluno: " + resultado);
        
    }
}
