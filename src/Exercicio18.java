import java.util.Random;

public class Exercicio18 {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] matriz = new int[3][3];

        int[] array1 = new int[3];

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                matriz[i][j] = random.nextInt(10);
            }
        }

        for(int i = 0 , c = 0; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(j == 0){
                    array1[j] = matriz[i][j] +array1[j];
                    c++;
                }
                else if(j == 1){
                    array1[j] = matriz[i][j] + array1[j];
                    c++;
                }
                else if(j == 2){
                    array1[j] = matriz[i][j] + array1[j];
                    c++;
                }

            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + matriz[i][j]);
            }
            System.out.println();
        }

        for (int i = 0 ; i < 3 ; i++) {
            System.out.println("|   "+array1[i]);
        }
    }
}
