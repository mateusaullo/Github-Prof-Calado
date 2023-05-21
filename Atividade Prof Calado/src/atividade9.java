//Nome Aluno: Mateus Saullo Felizardo
//RA: 12523137684

//Nome do Programa:  Faça um programa que receba o valor da venda, escolha a 
//condição de pagamento no menu e mostre o total da venda final 
//conforme condições a seguir:
///Venda a Vista - desconto de 10%
//Venda a Prazo 30 dias - desconto de 5%
//Venda a Prazo 60 dias - mesmo preço
//Venda a Prazo 90 dias - acréscimo de 5%
//Venda com cartão de débito - desconto de 8%
//Venda com cartão de crédito - desconto de 7 %



import java.util.Scanner;
public class atividade9 {
    public static void main(String[] args) throws Exception {
        double valor,vendafinal,vendafinal2,vendafinal4,vendafinal5,vendafinal6;
        int opcao;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Coloque o valor do produto: ");
        valor = teclado.nextDouble();

        System.out.println("-------- FORMAS DE PAGAMENTOS ------------------ ");
        System.out.println("1 - Venda a Vista - desconto de 10% ");
        System.out.println("2 - Venda a Prazo 30 dias - desconto de 5% ");
        System.out.println("3 - Venda a Prazo 60 dias - mesmo preço ");
        System.out.println("4 - Venda a Prazo 90 dias - acréscimo de 5% ");
        System.out.println("5 - Venda com cartão de débito - desconto de 8% ");
        System.out.println("6 - Venda com cartão de crédito - desconto de 7 % ");
        System.out.println("---------------------------------------------------");
        System.out.print("Digite a opcao: ");
        opcao = teclado.nextInt();
        teclado.close();

        vendafinal = valor - 10;
        vendafinal2 = valor - 5;
        vendafinal4 = valor + 5;
        vendafinal5 = valor - 8;
        vendafinal6 = valor - 7;

        switch(opcao){
          case 1:
          System.out.printf("O valor total da Venda a Vista com desconto de 10%% foi de R$%.2f reais",vendafinal);
          break;

          case 2:
          System.out.printf("O valor total da Venda a Prazo 30 dias  com desconto de 5%% foi de R$%.2f reais",vendafinal2);
          break;

          case 3:
          System.out.printf("O valor total da Venda a Prazo 60 dias -  foi de R$%.2f reais",valor);
          break;

          case 4:
          System.out.printf("O valor total da Venda a Prazo 90 dias com acréscimo de 5%% foi de R$%.2f reais",vendafinal4);
          break;

          case 5:
          System.out.printf("O valor total da Venda com cartão de débito com desconto de 8%% foi de R$%.2f reais",vendafinal5);
          break;

          case 6:
          System.out.printf("O valor total da Venda com cartão de crédito com desconto de 7%% foi de R$%.2f reais",vendafinal6);
          break;

          default:
          System.out.println("Numero incorreto,tente novamente");
          break;
        }

    }
}