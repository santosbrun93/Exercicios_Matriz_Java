import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matrizAlunosMedias = new int[5][4];

        int indiceLinhamaiorNota = 0, indiceColunaMatricula = 0, indiceColunaNotaFinal = 3;

        int maiorNota = 0;

        for(int linha = 0 ; linha < 5 ; linha++){
            for(int coluna = 0 ; coluna < 5; coluna++){

                if(coluna == 0){
                    System.out.println("Insira a matricula: ");
                    matrizAlunosMedias[linha][coluna] = entrada.nextInt();
                }
                if(coluna == 1){
                    System.out.println("Insira a média das provas: ");
                    matrizAlunosMedias[linha][coluna] = entrada.nextInt();
                }
                if(coluna == 2){
                    System.out.println("Insira a média dos trabalhos: ");
                    matrizAlunosMedias[linha][coluna] = entrada.nextInt();
                }
                if(coluna == 3){
                    matrizAlunosMedias[linha][coluna] = matrizAlunosMedias[linha][1] + matrizAlunosMedias[linha][2];

                    if(linha == 0){
                        maiorNota = matrizAlunosMedias[linha][coluna];
                        indiceLinhamaiorNota = linha;
                    }else if(maiorNota < matrizAlunosMedias[linha][coluna]){
                        maiorNota = matrizAlunosMedias[linha][coluna];
                        indiceLinhamaiorNota = linha;
                    }
                }
            }
        }
        System.out.println("O aluno com maior nota é a matricula: " +matrizAlunosMedias[indiceLinhamaiorNota][indiceColunaMatricula]);
        System.out.println("A maior nota é : "+matrizAlunosMedias[indiceLinhamaiorNota][indiceColunaNotaFinal]);

    }
}
