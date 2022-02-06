import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        int x = 0, colunaMaior = 0;

        Random random = new Random();

        Scanner entrada = new Scanner(System.in);

        for (int linha = 0; linha < 5; linha++) {

            for (int coluna = 0; coluna < 5; coluna++) {
                matriz[linha][coluna] = random.nextInt(20);
            }
        }

        for(int linha = 0 ; linha < 5; linha++) {

            for(int coluna = 0 ; coluna < 5; coluna++) {
                System.out.println(matriz[linha][coluna]);
            }
            System.out.println("\n");
        }

        System.out.println("Matriz Preenchida!!");
        System.out.println("Informe um número que deseja encontrar: ");
        x = entrada.nextInt();

        for (int linha = 0; linha < 5; linha++) {

            for (int coluna = 0; coluna < 5; coluna++) {
                if(x == matriz[linha][coluna]){
                    System.out.println("Valor encontrado!!");
                    System.out.println("Linha: "+linha);
                    System.out.println("Coluna: "+coluna);
                }else
                    System.out.println("\n");
                    System.out.println("Valor não encontrado nessa linha!!");
            }
        }
    }
}