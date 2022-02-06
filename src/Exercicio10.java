import java.util.Random;

public class Exercicio10 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        Random random = new Random();

        for (int linha = 0; linha < 3; linha++) {

            for (int coluna = 0; coluna < 3; coluna++) {
                matriz[linha][coluna] = random.nextInt(20);
            }
        }
    }
}
