//Nome Aluno: Mateus Saullo Felizardo
//RA: 12523137684
//Nome do Programa:Faça um programa para imprimir o conceito de um aluno. O
//conceito é calculado em função da nota do aluno que varia de 0
//a 100. As faixas da correlação são mostradas abaixo:
//Nota Conceito
//0 a 49 Insuficiente
//50 a 64 Regular
//65 a 84 Bom
//85 100 Ótimo


import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Coloque a nota do aluno: ");
        int nota = teclado.nextInt();
        teclado.close();

        if(nota <=0 || nota <=49){
            System.out.print("Insuficiente");
        }
        else if(nota >=50 && nota <=64){
            System.out.print("Regular");
        }
        else if(nota >=65 && nota <=84){
            System.out.print("Bom");
        }
        else if(nota >=85 && nota <=100){
            System.out.print("Otimo");
        }
    }
}
