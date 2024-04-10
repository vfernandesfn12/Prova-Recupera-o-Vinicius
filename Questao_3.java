/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_3;

import java.util.Scanner;

/**
 *
 * @author vnovaes
 */
public class Questao_3 {
    
   

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int n1 = scanner.nextInt();
        int sucessor = (n1 + 1);
        int antecessor = (n1 - 1);
        
        System.out.println("O sucessor é" + sucessor);
        System.out.println("O antecessor é " + antecessor);
       
       
        
        
        
    }
}
