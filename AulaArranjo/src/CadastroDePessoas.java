
import java.util.ArrayList;

public class CadastroDePessoas {

    private ArrayList<Pessoa> listaPessoa;

    private static CadastroDePessoas cad = null;

    //construto privado para evitar que o cadastro seja instanciado mais de uma vez
    private CadastroDePessoas() {
        listaPessoa = new ArrayList<>();
    }

    //Metodo de classe que retorna a referência para o cadastro instanciado
    public static CadastroDePessoas getInstance() {
        if (cad == null) {
            cad = new CadastroDePessoas();
        }
        return cad;
    }
    
    public void add(Pessoa p) {
        listaPessoa.add(p);
    }
    
    @Override
    public String toString() {
        return "CadastroDePessoas{" + "listaPessoa=" + listaPessoa + '}';
    }

    

    
}
