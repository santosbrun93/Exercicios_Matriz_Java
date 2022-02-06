import java.util.Random;

public class Exercicio14 {

    public static void main(String[] args) {

        int[][] matriz = new int[5][5];

        Random random = new Random();

        for (int linha = 0; linha < 5; linha++) {

            for (int coluna = 0; coluna < 5; coluna++) {
                matriz[linha][coluna] = random.nextInt(100);
            }
        }
    }
}
