package academia;

public class Aluno {
    private int matricula;
    private String nome;
    private int anoNascimento;

    public Aluno(int umaMatricula,String umNome,int umAnoNascimento){
        nome = umNome;
        matricula = umaMatricula;
        anoNascimento = umAnoNascimento;
    }
    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the anoNascimento
     */
    public int getAnoNascimento() {
        return anoNascimento;
    }
    
    @Override
    public String toString(){
        return("Matricula: " + matricula+ ", Nome: "+nome+", Ano Nascimento: "+anoNascimento);
    }
}
