import java.util.Random;

public class Exercicio11 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        Random random = new Random();

        for (int linha = 0; linha < 3; linha++) {

            for (int coluna = 0; coluna < 3; coluna++) {
                matriz[linha][coluna] = random.nextInt(20);
            }
        }


        for(int linha = 0 ; linha < 3; linha++) {

            for(int coluna = 0 ; coluna < 3; coluna++) {
                System.out.println(matriz[linha][coluna]);
            }
            System.out.println("\n");
        }
        int soma = 0;
        int coluna = matriz[0].length - 1;
        for (int linha = 0; linha < matriz.length; linha++) {
            soma = matriz[linha][coluna] + soma;
            coluna--;
            if (coluna < 0) // acabaram as colunas, interrompe o for
                break;
        }

        System.out.println("A soma da diagonal secundária: "+soma);


    }
}
