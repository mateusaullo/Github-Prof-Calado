//* Nome do Aluno: Mateus Saullo Felizardo
//* RA:12523137684
//* Nome do Programa:Faça um programa que solicite ao usuário que digite um número até que ele digite um número menor que 0 (utilize while)
//* Data: 19/04

import java.util.Scanner;

public class atividade16 {
    public static void main(String[] args) {
        int numero = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = teclado.nextInt();

        while(numero >= 0) {
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();
        }

        System.out.println("Você digitou um número menor que 0.");
        teclado.close();
    }
}