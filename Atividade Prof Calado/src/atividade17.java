//* Nome do Aluno: Mateus Saullo Felizardo
//* RA:12523137684
//* Nome do Programa: Faça um programa que imprima os múltiplos negativos de 7,superiores a -1000. (utilize do / while)

public class atividade17 {
    public static void main(String[] args) {
        int num = -7;

        do {
            System.out.println(num);
            num -= 7;
        } while (num >= -1000);
    }
}