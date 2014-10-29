package academia;

import java.io.IOException;

public class AppAcademia {

    public static void printTurma(Turma turma) {
        System.out.println("\nTurma de " + turma.getModalidade());
        System.out.println("Professor: " + turma.getProfessor());
        for (int i = 0; i < turma.size(); i++) {
            System.out.println(turma.get(i));
        }

    }

    public static void printConsulta(String titulo, Turma turma) {
        System.out.println("\nTurma de " + titulo);
        System.out.println("Professor: " + turma.getProfessor());
        for (int i = 0; i < turma.size(); i++) {
            System.out.println(turma.get(i));
        }
    }

    public static void main(String[] args) {
        try {
            PersistenceLevel.getInstance().loadCadastroAlunos();
        } catch (IOException ex) {
            System.out.println("Problemas na leitura do cadastro de alunos!!");
        }
        /*
        for (int i = 0; i < CadastroAlunos.getInstance().size(); i++) {
        System.out.println(CadastroAlunos.getInstance().getAluno(i));
        }
         */
        printTurma(CadastroTurmas.getInstance().getTurma(Modalidade.MUSCULACAO));
        printTurma(CadastroTurmas.getInstance().getTurma(Modalidade.LOCALIZADA));
        printTurma(CadastroTurmas.getInstance().getTurma(Modalidade.SPINNING));

        printConsulta("Alunos que fazem musculacao ou localizada", CadastroTurmas.getInstance().alunosQueFazemMusculacaoOuLocalizada());
        printConsulta("Alunos que fazem musculacao e spinning", CadastroTurmas.getInstance().alunosQueFazemMusculacaoESpinning());
        printConsulta("Alunos que fazem tudo", CadastroTurmas.getInstance().alunosQueFazemTudo());
        printConsulta("Alunos que fazem musculação ou localizada mas não fazem spinning", CadastroTurmas.getInstance().alunosQueFazemMusculacaoOuLocalizadaMasNaoSpinning());
    }
}
