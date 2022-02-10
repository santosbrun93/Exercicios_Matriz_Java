import java.util.Random;

public class Exercicio14 {

    public static void main(String[] args) {

        int[][]cartela = new int[5][5];

        int[] numerosSorteados = new int[100];

        for(int i = 0 ; i < 100 ; i++){
            numerosSorteados[i] = -1;
        }
        Random randon = new Random();

        for(int linha =0; linha < 5; linha++ ) {
            for(int coluna =0; coluna < 5; coluna++ ) {
                boolean validacao = false;
                do{
                    int sorteado = randon.nextInt(100);
                    validacao = validaNumero(numerosSorteados, sorteado);
                    if(!validacao){
                        cartela[linha][coluna] = numerosSorteados[sorteado];
                    }
                }while(validacao);
            }
        }




        for(int linha = 0 ; linha < 5; linha++) {

            for(int coluna = 0 ; coluna < 5; coluna++) {
                System.out.print("| "+cartela[linha][coluna]+" |");
            }
            System.out.println("\n");
        }



    }

    public static boolean validaNumero(int[] vetor, int numeroRecebido){
        int numero = vetor[numeroRecebido];
        return numero > 0;
    }
}
