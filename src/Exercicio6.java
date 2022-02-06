import java.util.Random;

public class Exercicio6 {

    public static void main(String[] args) {
        int[][] matriz1 = new int[4][4];

        int[][] matriz2 = new int[4][4];

        int[][] matriz3 = new int[4][4];

        Random random = new Random();

        for (int linha = 0; linha < 4; linha++) {

            for (int coluna = 0; coluna < 4; coluna++) {
                matriz1[linha][coluna] = random.nextInt(20);
                matriz2[linha][coluna] = random.nextInt(20);
            }
        }


        for (int linha = 0; linha < 4; linha++) {

            for (int coluna = 0; coluna < 4; coluna++) {
                if(matriz1[linha][coluna] == matriz2[linha][coluna]) {
                    matriz3[linha][coluna] = matriz1[linha][coluna];
                }
                else if(matriz1[linha][coluna] < matriz2[linha][coluna]){
                    matriz3[linha][coluna] = matriz2[linha][coluna];
                }else if(matriz2[linha][coluna] < matriz1[linha][coluna]){
                    matriz3[linha][coluna] = matriz1[linha][coluna];
                }
            }
        }

        for(int linha = 0 ; linha < 4; linha++) {

            for(int coluna = 0 ; coluna < 4; coluna++) {
                System.out.println(matriz1[linha][coluna]);
            }
            System.out.println("\n");
        }

        for(int linha = 0 ; linha < 4; linha++) {

            for(int coluna = 0 ; coluna < 4; coluna++) {
                System.out.println(matriz2[linha][coluna]);
            }
            System.out.println("\n");
        }

        for(int linha = 0 ; linha < 4; linha++) {

            for(int coluna = 0 ; coluna < 4; coluna++) {
                System.out.println(matriz3[linha][coluna]);
            }
            System.out.println("\n");
        }
    }
}
