//* Nome do Aluno: Mateus Saullo Felizardo
//* RA:12523137684
//* Nome do Programa:Faça um programa que determine o fatorial de um número. Para
//este problema, tem-se como entrada o valor do número do qual
//se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O
//fatorial de um número N (N!) é definido conforme a seguir
//(utilize for):
//i. N! = 1 * 2 * 3 * 4 * ... * (N-1) * N

import java.util.Scanner;
public class atividade18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        

        System.out.print("Digite um numero: ");
        numero = teclado.nextInt();
        teclado.close();
        
        int fatorial = 1;
        int calculo;
        for(calculo=1; calculo<=numero; calculo++){
            fatorial *= calculo;
            
        }
        System.out.printf("%d! = %d",numero,fatorial);
        
    }
}
