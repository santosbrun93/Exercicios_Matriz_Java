import java.util.Random;

public class Exercicio1 {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        int contador = 0;

        for(int i = 0; i < 4 ; i++){
            for(int j = 0; j < 4 ; j++){
                matriz[i][j] = random.nextInt(15);
            }
        }

        for(int i = 0; i < 4 ; i++){
            for(int j = 0; j < 4 ; j++){
                if(matriz[i][j] >= 10){
                    contador++;
                }
            }
        }

        System.out.println("A matriz possui: "+contador);
    }
}
