/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_5;

import java.util.Scanner;

/**
 *
 * @author vnovaes
 */
public class Questao_5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        //Entrada de dados (Usuario digita primeiro número para o calculo)
        System.out.println("Escreva um número: ");
        int n1 = scanner.nextInt();
        
        //Entrada de dados (Usuario digita segundo número para o calculo)
        System.out.println("Escreva o segundo número: ");
        int n2 = scanner.nextInt();
        
        //Declaração de Variáveis para o calculo
        int soma = (n1 + n2);
        int media = (n1 + n2)/2;
        
        //Saída de dados
        System.out.println("A soma dos números é " + soma);
        System.out.println("A média dos números é " + media);
        
    }
}
