/*
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

public class MediaArrayList {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        
        int quantidadeNotas;
        
        // Perguntar o número de notas a serem inseridas
        System.out.println("Quantas notas você quer inserir?");
        quantidadeNotas = pergunta.nextInt();
        
        // Inserir as notas com validação
        for (int i = 0; i < quantidadeNotas; i++) {
            do {
                System.out.println("Digite a " + (i + 1) + "ª nota: ");
                double nota = pergunta.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    notas.add(nota); // Adiciona a nota na lista
                } else {
                    System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
                }
            } while (notas.size() <= i); // Enquanto a nota não for válida, pede novamente
        }

        // Exibir as notas inseridas
        System.out.println("\nNotas inseridas:");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
           */