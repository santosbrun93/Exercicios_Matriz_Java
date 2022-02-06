import java.util.Random;

public class Exercicio13 {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        Random random = new Random();

        for (int linha = 0; linha < 4; linha++) {

            for (int coluna = 0; coluna < 4; coluna++) {
                matriz[linha][coluna] = random.nextInt(20);
            }
        }

        for(int linha = 0 ; linha < 3; linha++) {

            for(int coluna = 0 ; coluna < 3; coluna++) {
                System.out.println(matriz[linha][coluna]);
            }
            System.out.println("\n");
        }

        for (int linha = 0; linha < 4; linha++) {

            for (int coluna = 0; coluna < 4; coluna++) {
                if(linha > coluna) matriz[linha][coluna] = 0;
            }
        }

        for(int linha = 0 ; linha < 3; linha++) {

            for(int coluna = 0 ; coluna < 3; coluna++) {
                System.out.println(matriz[linha][coluna]);
            }
            System.out.println("\n");
        }
    }
}
