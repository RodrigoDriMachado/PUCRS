package academia;

import java.util.ArrayList;

public class CadastroAlunos {
    private static CadastroAlunos cadAl = null;
    private ArrayList<Aluno> lst;

    public static CadastroAlunos getInstance() {
        if (cadAl == null) {
            cadAl = new CadastroAlunos();
        }
        return (cadAl);
    }

    private CadastroAlunos() {
        lst = new ArrayList<Aluno>();
    }

    private boolean matriculaValida(int m) {
        if (m < 0) {
            return (false);
        } else {
            return (true);
        }
    }

    public Aluno getAluno(int matr) {
        if (!matriculaValida(matr)) {
            throw new IllegalArgumentException("Matricula invalida");
        }
        for (Aluno a : lst) {
            if (a.getMatricula() == matr) {
                return (a);
            }
        }
        return (null);
    }

    public boolean isIn(int matr) {
        if (!matriculaValida(matr)) {
            return (false);
        }
        for (Aluno a : lst) {
            if (a.getMatricula() == matr) {
                return (true);
            }
        }
        return (false);
    }

    public void add(Aluno a) {
        if (!matriculaValida(a.getMatricula())) {
            throw new IllegalArgumentException("Numero de matricula invalido");
        }
        if (isIn(a.getMatricula())) {
            throw new IllegalArgumentException("Numero de matricula existente");
        }
        lst.add(a);
    }

    public void remove(Aluno a) {
        lst.remove(a);
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
