import java.util.Random;

public class Exercicio14 {

    public static void main(String[] args) {

        int[][]cartela = new int[5][5];

        Random randon = new Random();

        for(int x=0; x < 5; x++ ) {
            for(int y=0; y < 5; y++ ) {
                int n = randon.nextInt(99) + 1;
                int z = 0;
                while(z < 5){
                    if(cartela[x][z] == n){
                        n = randon.nextInt(99) + 1;
                        z = 0;
                    }
                    z++;
                }
                cartela[x][y] = n;
            }
        }
        for(int linha = 0 ; linha < 5; linha++) {

            for(int coluna = 0 ; coluna < 5; coluna++) {
                System.out.println(cartela[linha][coluna]);
            }
            System.out.println("\n");
        }



    }
}
