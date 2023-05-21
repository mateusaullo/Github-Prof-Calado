//* Nome do Aluno: Mateus Saullo Felizardo
//* RA:12523137684
//* Nome do Programa: Faça um programa que preencha com zeros todas as posições de uma matriz com 10 linha e 10 colunas



public class atividade15 {
    public static void main(String[] args) {

        int[][] matriz = new int[10][10];
        

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
             matriz[i][j] = 0;
             System.out.print(" "+matriz[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
