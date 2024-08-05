package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    Scanner pergunta = new Scanner(System.in);
        String resultado;

        System.out.println("Digite a sua primeira nota: ");
        double primeiraNota = pergunta.nextInt(); System.out.println();
        System.out.println("Digite a sua segunda nota: ");
        double segundaNota = pergunta.nextInt();

        double media = (primeiraNota + segundaNota) / 2;

        if (media >= 7){
            resultado = "Aprovado.";
        }else if (media >= 5){
            resultado = "Verificação Suplementar.";
        }else{
            resultado = "Reprovado.";
        }

        System.out.println("Média: " + media);
        System.out.println("Situação: " + resultado);
    
    }
}
