package gameentry;

public class GameEntry {
    private String nome;
    private int score;

    public GameEntry(String umNome,int umScore){
        nome = umNome;
        score = umScore;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    @Override
    public String toString(){
        return(nome+": "+score);
    }
}
