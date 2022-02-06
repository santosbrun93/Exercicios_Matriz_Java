import java.util.Random;

public class Exercicio9 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        int soma = 0;

        Random random = new Random();

        for (int linha = 0; linha < 3; linha++) {

            for (int coluna = 0; coluna < 3; coluna++) {
                matriz[linha][coluna] = random.nextInt(20);

                if(linha > coluna){
                    soma = matriz[linha][coluna] + soma;
                }
            }
        }

        for(int linha = 0 ; linha < 3; linha++) {

            for(int coluna = 0 ; coluna < 3; coluna++) {
                System.out.println(matriz[linha][coluna]);
            }
            System.out.println("\n");
        }

        System.out.println("A soma inferior da Diagonal Principal é :"+soma);
    }
}
