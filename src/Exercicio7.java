import java.util.Random;

public class Exercicio7 {

    public static void main(String[] args) {

        double[][] matriz = new double[10][10];

        Random random = new Random();

        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {

                if (linha < coluna) {
                    matriz[linha][coluna] = (2 * linha) + (7 * coluna) - 2;
                } else if (linha > coluna) {
                    matriz[linha][coluna] = (Math.pow(linha , 3) * 3) - (5 * Math.pow(coluna, 2)) + 1;
                }
                else {
                    matriz[linha][coluna] = Math.pow(linha , 2) * 3 - 1;
                }
            }
        }

        for(int linha = 0 ; linha < 10; linha++) {

            for(int coluna = 0 ; coluna < 10; coluna++) {
                System.out.printf("%.2f ",matriz[linha][coluna]);
            }
            System.out.println("\n");
        }
    }
}