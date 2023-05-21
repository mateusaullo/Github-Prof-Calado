//Nome Aluno: Mateus Saullo Felizardo
//RA: 12523137684
//Nome do Programa: Elabore um programa que lê dois valores A e B e os escreve com a mensagem: “São múltiplos” ou “Não são múltiplos”.

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.print("Coloque o primeiro numero: ");
        int a = teclado.nextInt();
        System.out.print("Coloque o segundo numero: ");
        int b = teclado.nextInt();
        teclado.close();

        if((a % b) == 0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao Sao Multiplos");
        }
    }
}
