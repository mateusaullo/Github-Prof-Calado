//Nome Aluno: Mateus Saullo Felizardo
//RA: 12523137684
//Nome do Programa: Construa um programa que receba como entrada três valores A, B e C e os imprima em ordem crescente.

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) throws Exception {

        double n1,n2,n3;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Coloque o primeiro numero: ");
        n1 = teclado.nextDouble();
        System.out.print("Coloque o segundo numero: ");
        n2 = teclado.nextDouble();
        System.out.print("Coloque o terceiro numero: ");
        n3 = teclado.nextDouble();
        teclado.close();

        if(n1<=n2 && n2<=n3){
            System.out.printf("\nA ordem crescente eh: %.0f , %.0f , %.0f",n1,n2,n3);
        }
        else if(n1<=n3 && n3<=n2){
            System.out.printf("A ordem crescente eh: %.0f , %.0f , %.0f",n1,n3,n2);
        }
        else if(n2<=n1 && n1<=n3){
            System.out.printf("A ordem crescente eh: %.0f , %.0f , %.0f",n2,n1,n3);
        }
        else if(n2<=n3 && n3<=n1){
            System.out.printf("A ordem crescente eh: %.0f , %.0f , %.0f",n2,n3,n1);
        }
        else if(n3<=n2 && n2<=n1){
            System.out.printf("A ordem crescente eh: %.0f , %.0f , %.0f",n3,n2,n1);
        }
        else if(n3<=n1 && n1<=n2){
            System.out.printf("A ordem crescente eh: %.0f , %.0f , %.0f",n3,n1,n2);
        }
}   }
