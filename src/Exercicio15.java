import java.util.Random;

public class Exercicio15 {
    public static void main(String[] args) {
        char[] AlternativasVetor = {'a', 'b', 'c', 'd'};

        char[][] matrizQuestoes_Alunos = new char[10][5];

        char[] gabarito = {'a', 'b', 'c' ,'d' , 'c' , 'b', 'a', 'd' , 'd' , 'a' };

        double[] notas = new double[5];

        Random random = new Random();

        for(int questao = 0 ; questao < 10 ; questao++){
            for(int aluno = 0 ; aluno < 5; aluno++){
                matrizQuestoes_Alunos[questao][aluno] = AlternativasVetor[random.nextInt(4)];

                if(matrizQuestoes_Alunos[questao][aluno] == gabarito[questao]){
                    notas[aluno]++;
                }
            }
        }
        for(int linha = 0 ; linha < 10; linha++) {

            for(int coluna = 0 ; coluna < 5; coluna++) {
                System.out.print("| "+matrizQuestoes_Alunos[linha][coluna]+" |");
            }
            System.out.println("\n");
        }

        for(int i = 0 ; i < 5 ; i++){
            System.out.println("A nota do aluno "+i+" é  "+notas[i]);
        }
    }
}
