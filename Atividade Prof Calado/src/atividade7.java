//Nome Aluno: Mateus Saullo Felizardo
//RA: 12523137684

//Nome do Programa:Faça um programa calcula o total de uma hospedagem em um
//hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
//R$ 5.50 por diária, se o número de diárias for maior que 15;
//R$ 6.00 por diária, se o número de diárias for igual a 15;
//R$ 8.00 por diária, se o número de diárias for menor que 15.



import java.util.Scanner;
public class atividade7 {
    public static void main(String[] args) throws Exception {
      
     double diaria,dias,resultado,resultado2,resultado3,taxa,taxa2,taxa3;
     Scanner teclado = new Scanner(System.in);

     System.out.print("Coloque os dias que ira ficar: ");
     dias = teclado.nextDouble();
     teclado.close();
      
     diaria = 60.00;
     taxa = 5.50;
     taxa2 = 6.00;
     taxa3 = 8.00;
     
     resultado = (diaria + taxa) * dias;
     resultado2 = (diaria + taxa2) * dias;
     resultado3 = (diaria +taxa3) * dias;

     if(dias >15){
     System.out.printf("Voce ficou %.0f dias e tera que pagar R$%.2f reais",dias,resultado);
     }
     else if(dias ==15){
        System.out.printf("Voce ficou %.0f dias e tera que pagar R$%.2f reais",dias,resultado2);
     }
     else if(dias <15){
        System.out.printf("Voce ficou %.0f dias e tera que pagar R$%.2f reais",dias,resultado3);
     }
     
   }
}