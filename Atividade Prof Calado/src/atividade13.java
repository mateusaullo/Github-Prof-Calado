//* Nome do Aluno: Mateus Saullo Felizardo
//* RA:12523137684
//* Nome do Programa:Faça um programa que some os números de 1 a 100 e imprima somente o valor total da soma (utilize while).

public class atividade13 {
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;
        while (i <= 100) {
            soma += i;
            i++;
        }
        System.out.println(soma);
    }
}