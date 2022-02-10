import java.util.Random;
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Random random = new Random();

        char[] AlternativasVetor = {'a', 'b', 'c', 'd','e'};

        char[] gabarito = new char[10];

        for(int i = 0; i < 10; i++){
            gabarito[i] = AlternativasVetor[random.nextInt(5)];
        }

        char[][] matrizQuestoes_Alunos = new char[10][3];

        int[] matricula = new int[3];

        double[] notas = new double[3];

        for(int questao = 0 ; questao < 10 ; questao++){
            for(int aluno = 0 ; aluno < 3; aluno++){

                if(questao == 0) {
                    System.out.println("Insira a matrícula do aluno: ");
                    matricula[aluno] = entrada.nextInt();
                }
                matrizQuestoes_Alunos[questao][aluno] = AlternativasVetor[random.nextInt(5)];

                if(matrizQuestoes_Alunos[questao][aluno] == gabarito[questao]){
                    notas[aluno]++;
                }
            }
        }

        for(int i = 0 ; i < 3 ; i++){
            System.out.println();
            System.out.println("A matricula é: "+matricula[i]);

            for(int j = 0 ; j < 10 ; j++){
                System.out.println("| "+matrizQuestoes_Alunos[j][i]+" |");
            }
            System.out.println("A nota do aluno "+(i+1)+" é  "+notas[i]);

            if(notas[i] < 7.0){
                System.out.println("O aluno está reprovado.");
            }else System.out.println("O aluno está aprovado.");
        }
    }
}
