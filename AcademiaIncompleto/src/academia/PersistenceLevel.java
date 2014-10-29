package academia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class PersistenceLevel {

    private static PersistenceLevel pl = null;

    private PersistenceLevel() {
    }

    public static PersistenceLevel getInstance() {
        if (pl == null) {
            pl = new PersistenceLevel();
        }
        return (pl);
    }

    public void saveCadastroAlunos() throws IOException {
        FileWriter fw = new FileWriter("CadAlunos.txt");
        CadastroAlunos ca = CadastroAlunos.getInstance();
        for (int i = 0; i < ca.size(); i++) {
            fw.write((ca.get(i).toString()) + "\n");
        }
        fw.close();
    }

    public void loadCadastroAlunos() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("CadAlunos.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            StringTokenizer st = new StringTokenizer(line, ",");
            if (!st.hasMoreTokens()) {
                break; // para lidar com as linhas em branco do arquivo
            }
            int matricula = Integer.parseInt(st.nextToken());
            String nome = st.nextToken();
            int idade = Integer.parseInt(st.nextToken());
            Aluno aluno = new Aluno(matricula, nome, idade);
            CadastroAlunos.getInstance().add(aluno);
        }
    }

    public void saveTurma(Turma turma, String fName) throws IOException {
        FileWriter fw = new FileWriter(fName);
        for (int i = 0; i < turma.size(); i++) {
            fw.write(turma.get(i).getMatricula() + ",");
        }
        fw.close();
    }

    public Turma loadTurma(String fName, Modalidade modalidade) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fName));
        String line = br.readLine();
        if (line == null) {
            return null;
        }
        StringTokenizer st = new StringTokenizer(line, ",");
        String professor = st.nextToken();
        Turma turma = new Turma(professor, modalidade);
        while (st.hasMoreTokens()) {
            int matricula = Integer.parseInt(st.nextToken());
            Aluno aluno = CadastroAlunos.getInstance().get(matricula);
            turma.add(aluno);
        }
        return (turma);
    }
}
