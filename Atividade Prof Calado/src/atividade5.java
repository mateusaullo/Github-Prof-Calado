//Nome Aluno: Mateus Saullo Felizardo
//RA: 12523137684
//Nome do Programa:Faça um programa que leia o nome, o sobrenome, a idade, em
//anos, e a naturalidade (cidade de nascimento) de uma pessoa.
//Depois, o programa deve dar a seguinte opção “Deseja
//visualizar dados completos?”. Se o caractere digitado pelo
//usuário for ‘S’ o programa deve imprimir na tela Nome,
//Sobrenome, idade e naturalidade. Se o caractere digitado pelo
//usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
//o caractere não for nenhuma das outras opções acima o programa
//deve imprimir “Digitação errada. Tente Novamente”.

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Seu Nome: ");
        String nome = teclado.next();

        System.out.print("Seu Sobrenome: ");
        String sobrenome = teclado.next();

        System.out.print("Sua Idade: ");
        int idade = teclado.nextInt();

        System.out.print("Sua Naturalidade: ");
        String naturalidade = teclado.next();

        System.out.print("Deseja visualizar dados completos? (S/N): ");
        String escolha = teclado.next();

        teclado.close();

        if(escolha.equals ("S")){
           System.out.printf("%s %s %d %s",nome,sobrenome,idade,naturalidade);
        }
        else if(escolha.equals("N")){
            System.out.printf("%s %d",nome,idade);
        }
        else{
            System.out.println("Digitacao errado ,Tente novamente");
        } 
    }
    
}
