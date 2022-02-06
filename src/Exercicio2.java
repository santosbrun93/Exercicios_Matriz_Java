public class Exercicio2 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];



        for(int linha = 0 ; linha < 5; linha++) {

            for(int coluna = 0 ; coluna < 5; coluna++) {
                if(linha == coluna) matriz[linha][coluna] = 1 ; //Diagonal principal
                else matriz[linha][coluna] = 0;
            }
        }

        for(int linha = 0 ; linha < 5; linha++) {
            for(int coluna = 0 ; coluna < 5; coluna++)
            {
                System.out.println(matriz[linha][coluna]);
            }
            System.out.println("\n");
        }

    }
}
