import java.util.Random;
import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Random random = new Random();

        Scanner entrada = new Scanner(System.in);

        double[][] matrizA = new double[2][2];
        double[][] matrizB = new double[2][2];
        double[][] matrizSoma = new double[2][2];
        double[][] matrizSubtracao = new double[2][2];
        double[][] matrizSomaDaConstante = new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizA[i][j] = random.nextDouble();
                matrizB[i][j] = random.nextDouble();
            }
        }


        int opcao = 0;
        do {


            System.out.println("MENU:");
            System.out.println("1 - Exibir a soma das Matrizes");
            System.out.println("2 - Exibir a substração da primeira pela segunda");
            System.out.println("3 - Inserir uma constante nas matrizes");
            System.out.println("4 - Imprimir as matrizes matrizes");
            System.out.println("0 - Sair");

            System.out.println("Insira a opção Desejada");
            opcao = entrada.nextInt();

        switch (opcao) {

            case 1:
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
                    }
                    for (int a = 0; a < 2; a++) {
                        for (int b = 0; b < 2; b++) {
                            System.out.print("| " + matrizSoma[a][b]);
                        }
                        System.out.println();
                    }
                }
                    break;

                    case 2:
                        for (int c = 0; c < 2; c++) {
                            for (int d = 0; d < 2; d++) {
                                matrizSubtracao[c][d] = matrizB[c][d] - matrizA[c][d];
                                System.out.print("|  % " + matrizSubtracao[c][d]);

                            }
                            System.out.println();
                        }

                    case '3':
                        double constante = 0;

                        constante = entrada.nextDouble();

                        for (int c = 0; c < 2; c++) {
                            for (int d = 0; d < 2; d++) {
                                matrizSomaDaConstante[c][d] = matrizSomaDaConstante[c][d] + constante;
                                System.out.print("|  % " + matrizSomaDaConstante[c][d]);
                            }
                            System.out.println();
                        }

                    case '4':
                        for (int e = 0; e < 2; e++) {
                            for (int f = 0; f < 2; f++) {
                                System.out.print("| " + matrizA[e][f]);
                            }
                            System.out.println();
                        }
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.print("| " + matrizB[i][j]);
                            }
                            System.out.println();
                        }
                        break;
                    case '0':
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + opcao);


        }
        } while (opcao != 0);
    }
}



