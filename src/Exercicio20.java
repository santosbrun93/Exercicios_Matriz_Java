import java.util.Random;
import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Random random = new Random();

        float[][] matriz = new float[3][6];

        float somaColunaImpar = 0;

        float somaMedia = 0;

        float media = 0;

        float contadorMedia = 0;


        for(int linha = 0 ; linha < 3 ; linha++ ){
            for(int coluna = 0 ; coluna < 6 ; coluna++ ){
                matriz[linha][coluna] = random.nextFloat();

                if(coluna % 2 != 0){
                    somaColunaImpar = somaColunaImpar + matriz[linha][coluna];
                }

                if(coluna == 1 || coluna == 3){
                    somaMedia = somaMedia + matriz[linha][coluna];
                    contadorMedia++;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("| " + matriz[i][j]);
            }
            System.out.println();
        }


        for(int linha = 0 ; linha < 3 ; linha++ ){
                matriz[linha][5] = matriz[linha][0] + matriz[linha][1];
        }

        media = somaMedia / contadorMedia;

        System.out.println("A soma das colunas impares é :"+somaColunaImpar);
        System.out.println("A média aritmética das colunas 2 e 4 é: "+media);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("| " + matriz[i][j]);
            }
            System.out.println();
        }
    }
}
