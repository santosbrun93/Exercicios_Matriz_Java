import java.util.Random;

public class Exercicio4 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        int linhaMaior = 0, colunaMaior = 0;

        Random random = new Random();

        int maiorValor = 0;

        for(int linha = 0 ; linha < 4; linha++) {

            for(int coluna = 0 ; coluna < 4; coluna++) {
                matriz[linha][coluna] = random.nextInt(20);

                if(linha == 0 & coluna == 0){
                    maiorValor = matriz[linha][coluna];
                    linhaMaior = 0;
                    colunaMaior = 0;
                }
                else if (maiorValor < matriz[linha][coluna]){
                    maiorValor = matriz[linha][coluna];
                    linhaMaior = linha;
                    colunaMaior = coluna;
                }
            }
        }
        System.out.println("O Maior valor da matriz é "+maiorValor);
        System.out.println("A Linha do maior valor da matriz é "+linhaMaior);
        System.out.println("A Coluna do maior valor da matriz é "+colunaMaior);
    }
}
