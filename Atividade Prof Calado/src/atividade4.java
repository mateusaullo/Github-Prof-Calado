//Nome Aluno: Mateus Saullo Felizardo
//RA: 12523137684
//Nome do Programa: Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar e se é positivo ou negativo.

import java.util.Scanner;


public class atividade4 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Coloque um numero: ");
        int numero = teclado.nextInt();
        teclado.close();

        if(numero %2 ==0){
            System.out.print("Par ");
        }
        else{
            System.out.print("Impar ");
        }
        if(numero > 0){
            System.out.println("Positivo");
        }
        else{
            System.out.print("Negativo");
        }
    }
}
