package com.company;
import java.util.Scanner;

public class DadosAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome completo: " );
        String nome = scanner.nextLine();
        System.out.println("O que você cursa: ");
        String curso = scanner.nextLine();
        System.out.println("Qual periodo: ");
        int periodo = scanner.nextInt();
        System.out.println("Primeira nota: ");
        float primeiraNota = scanner.nextFloat();
        System.out.println("Segunda nota: ");
        float segundaNota = scanner.nextFloat();
        System.out.println("Quantidade de faltas: ");
        int faltas = scanner.nextInt();
        float media = (primeiraNota + segundaNota) / 2;



        System.out.println("Nome: "+nome);
        System.out.println("Curso: "+curso);
        System.out.println("Periodo: "+periodo);
        System.out.println("Quantidade de faltas: "+faltas);
        System.out.println("Média do aluno: "+media);


        }
}
