//* Nome do Aluno: Mateus Saullo Felizardo
//* RA:12523137684
//* Nome do Programa:Escreva um programa que, dada a carga máxima de um elevador e
//a quantidade máxima de pessoas digitadas pelo usuário, leia o
//peso de cada pessoa, também digitada pelo usuário, que entra
//no elevador até que a carga máxima seja atingida ou o número
//máximo de pessoas seja atingido (utilize do / while).

import java.util.Scanner;
public class atividade20 {
    public static void main(String[] args) {
      float elevador,elevadoratual,pesopessoa;
      int pessoas,pessoasatual;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Coloque a quantidade maxima do elevador: ");
        elevador = teclado.nextFloat();

        System.out.print("Coloque a quantidade maxima de pessoas: ");
        pessoas = teclado.nextInt();
        
        elevadoratual= 0;
        pessoasatual = 0;

        do{
            System.out.printf("Pessoa %d Digite seu peso: ",pessoasatual +1);
            pesopessoa = teclado.nextFloat();

            if(elevadoratual + pesopessoa > elevador){
                System.out.println("Carga máxima atingida!");
                break;
            }
           pessoasatual++;
           elevadoratual+=pesopessoa;

        }while(pessoasatual< pessoas);
        System.out.printf("Quantidade de pessoas atual: %d ",pessoasatual);
        System.out.printf("\nCarga Atual: %.2f ",elevadoratual);
        teclado.close();
    }
    
}
