import java.util.Random;

public class Exercicio3 {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        //Random random = new Random();

        for(int linha = 0 ; linha < 4; linha++) {

            for(int coluna = 0 ; coluna < 4; coluna++) {
                matriz[linha][coluna] = linha * coluna;
            }
        }

        for(int linha = 0 ; linha < 4; linha++) {

            for(int coluna = 0 ; coluna < 4; coluna++) {
                System.out.println(matriz[linha][coluna]);
            }
            System.out.println("\n");
        }


    }
}
