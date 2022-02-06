import java.util.Random;

public class Exercicio4 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        Random random = new Random();

        int maiorValor = 0;

        for(int linha = 0 ; linha < 4; linha++) {

            for(int coluna = 0 ; coluna < 4; coluna++) {
                matriz[linha][coluna] = random.nextInt(20);

                if(linha == 0 & coluna == 0){
                    maiorValor = matriz[linha][coluna];
                }
                else if (maiorValor < matriz[linha][coluna]){
                    maiorValor = matriz[linha][coluna];
                }
            }
        }
        System.out.println("O Maior valor da matriz é "+maiorValor);
    }
}
