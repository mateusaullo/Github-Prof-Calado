//* Nome do Aluno: Mateus Saullo Felizardo
//* RA:12523137684
//* Nome do Programa:Um determinado gás duplica seu volume a cada segundo. Dada um
//volume inicial, em centímetros cúbicos, digitado pelo usuário
//faça um programa que determine o tempo necessário para que
//esse volume se torne maior que 1000 centímetros cúbicos.
//(utilize while)



import java.util.Scanner;
public class atividade19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int inicial,atual,tempo;

        System.out.print("Coloque um volume inicial: ");
        inicial = teclado.nextInt();
        teclado.close();
         
        tempo = 0;
        atual = inicial;
        while(atual <=1000){
         tempo++;
            atual*=2;
        }
        System.out.printf("Tempo necessário: %d segundos\n", tempo);
    }
    
}
