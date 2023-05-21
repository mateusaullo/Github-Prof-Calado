//* Nome do Aluno: Mateus Saullo Felizardo
//* RA:12523137684
//* Nome do Programa:Faça um programa que exiba todos os números pares a partir de 0 até que encontre um múltiplo de 7 (utilize do/while)

public class atividade12 {
    public static void main(String[] args) {
        int i = 0;
        do {
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        } while(i % 7 != 0);
        System.out.println("\nO numero multiplo de 7: "+i);
    }

}
