//Nome Aluno: Mateus Saullo Felizardo
//RA: 12523137684

//Nome do Programa:Crie um programa que lê um número entre 1 e 12, correspondendo 
//a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro. 
//Ao final, o programa deve imprimir uma mensagem identificando, 
//com base no número digitado, o nome do mês e a estação. 
//Exemplo para o mês 1: "Mês: Janeiro – Estação: Verão"

//data: 13/04/2023

import java.util.Scanner;
public class atividade8 {
    public static void main(String[] args) throws Exception {

    int numero;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Coloque o numero do mes que queira: ");
    numero = teclado.nextInt();
    teclado.close();

    switch(numero){
        case 1:
        System.out.print("Mes Janeiro - Estação: Verão");
        break;
    
        case 2:
        System.out.print("Mes Fevereiro - Estação: Verão");
        break;

        case 3:
        System.out.print("Mes Marco - Estação: Outono");
        break;

        case 4:
        System.out.print("Mes Abril - Estação: Outono");
        break;

        case 5:
        System.out.print("Mes Maio - Estação: Outono");
        break;

        case 6:
        System.out.print("Mes Junho - Estação: Inverno");
        break;

        case 7:
        System.out.print("Mes Julho - Estação: Inverno");
        break;

        case 8:
        System.out.print("Mes Agosto - Estação: Inverno");
        break;

        case 9:
        System.out.print("Mes Setembro - Estação: Primavera");
        break;

        case 10:
        System.out.print("Mes Outubro - Estação: Primavera");
        break;

        case 11:
        System.out.print("Mes Novembro - Estação: Primavera");
        break;

        case 12:
        System.out.print("Mes Dezembro - Estação: Verão");
        break;

        default:
         System.out.print("Mes invalido tente novamente");
         break;
    }
 }

}
