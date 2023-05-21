//* Nome do Aluno: Mateus Saullo Felizardo
//* RA:12523137684
//* Nome do Programa: Escreva um programa que, dado um número positivo digitado pelo o usuário mostre a tabuada de todos os números de 1 até o número digitado. (utilize for)

import java.util.Scanner;

public class atividade21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Digite um numero da tabuada: ");
        int numero = teclado.nextInt();

        for(int i = 1; i<=numero; i++){

             System.out.println("\nTabuado do " + i + ":");
              for(int j = 1; j <= 10; j++){
              System.out.println(i+" x " + j +" = "+ (i*j));

            }
         }
           teclado.close();
     }
}
