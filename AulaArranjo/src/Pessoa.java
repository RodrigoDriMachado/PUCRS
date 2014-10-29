
public class Pessoa {
    private String nome; // atributo de instancia
    private int idade; // atributo de instancia
    private static int contador = 0; // atributo de classe

    
    /**
     * Construtor
     * @param nome
     * @param idade 
     */
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        contador ++;
    }
    
    /**
     * retora o nome
     * @return 
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    // metodo de classe, não precisa instanciar um objeto pessoa para acessar ele
    public static int getQuantidadeDeInstancias(){
        
        return contador;
    }
    
}
