package academia;

import java.util.ArrayList;

public class Turma {

    private ArrayList<Aluno> lst;
    private String professor;
    private Modalidade modalidade;

    public Turma(String umProf, Modalidade umaMod) {
        lst = new ArrayList<Aluno>();
        professor = umProf;
        modalidade = umaMod;
    }

    public String getProfessor() {
        return professor;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public boolean add(Aluno a) {
        if (CadastroAlunos.getInstance().isIn(a.getMatricula()) == false) {
            return (false);
        }
        lst.add(a);
        return (true);
    }

    public boolean isIn(Aluno a) {
        for (Aluno aluno : lst) {
            if (aluno.getMatricula() == a.getMatricula()) {
                return (true);
            }
        }
        return (false);
    }

    public Aluno getAluno(int matr) {
        for (Aluno a : lst) {
            if (a.getMatricula() == matr) {
                return (a);
            }
        }
        return (null);
    }

    public void remove(Aluno a) {
        lst.remove(getAluno(a.getMatricula()));
    }

    public int size() {
        return (lst.size());
    }

    public Aluno get(int i) {
        if (i < 0 || i >= lst.size()) {
            return (null);
        }
        return (lst.get(i));
    }
}
