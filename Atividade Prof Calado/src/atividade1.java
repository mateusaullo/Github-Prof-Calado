//Nome Aluno: Mateus Saullo Felizardo
//RA: 12523137684
//Nome do Programa: Faça um programa que leia dois números A e B e imprima o maior deles

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) throws Exception {
        
        int n1,n2;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Coloque o primeiro numero: ");
        n1 = teclado.nextInt();
        System.out.print("Coloque o segundo numero: ");
        n2 = teclado.nextInt();
        teclado.close();
    
        if(n1 > n2){
        System.out.print("O numero maior foi: "+ n1);
        
        }else {
        System.out.print("O numero maior foi: "+ n2);
        }
       
    }
}