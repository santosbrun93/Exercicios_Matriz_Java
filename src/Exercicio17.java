import java.util.Random;

public class Exercicio17 {

    public static void main(String[] args) {

        Random random = new Random();

        double[][] matrizProvas_Alunos = new double[10][3];

        double menorNota = 0;
        int prova1 = 0, prova2 = 0, prova3 = 0;


        for(int aluno = 0 ; aluno < 10 ; aluno++){
            for(int prova = 0 ; prova < 3; prova++){
                matrizProvas_Alunos[aluno][prova] = random.nextFloat();

                if(prova == 0){
                        menorNota = matrizProvas_Alunos[aluno][prova];
                        prova1++;

                }else if(menorNota > matrizProvas_Alunos[aluno][prova] && prova == 1){
                        menorNota = matrizProvas_Alunos[aluno][prova];
                        prova2++;
                        prova1--;
                }else if(menorNota > matrizProvas_Alunos[aluno][prova] && prova == 2){
                        menorNota = matrizProvas_Alunos[aluno][prova];
                        prova3++;
                        if(prova2 > prova1 ) prova2--;
                        else prova1--;
                }
            }
        }
        System.out.printf("A prova 1 foi a pior nota para %d alunos \n",prova1);
        System.out.printf("A prova 2 foi a pior nota para %d alunos \n",prova2);
        System.out.printf("A prova 3 foi a pior nota para %d alunos \n",prova3);



    }
}
