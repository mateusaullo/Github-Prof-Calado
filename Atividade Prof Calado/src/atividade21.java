import java.util.Scanner;

public class atividade21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Digite um numero da tabuada: ");
        int numero = teclado.nextInt();

        for(int i = 1; i<=numero; i++){

             System.out.println("\nTabuado do " + i + ":");
              for(int j = 1; j <= 10; j++){
              System.out.println(i+" x " + j +" = "+ (i*j));

            }
         }
           teclado.close();
     }
}
