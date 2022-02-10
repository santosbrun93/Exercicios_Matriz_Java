import java.util.Random;

public class Exercicio22 {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizC = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] = random.nextInt(50);
                matrizB[i][j] = random.nextInt(50);
                matrizC[i][j] = matrizA[i][j] * matrizB[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + matrizA[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + matrizB[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|  " + matrizC[i][j]);
            }
            System.out.println();
        }
    }

}