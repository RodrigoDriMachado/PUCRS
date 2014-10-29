/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praticaarquivo;

/**
 *
 * @author 12280437
 */
public class App {
    
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario (123, "Fulano", 2345.89);
        Funcionario f2 = new Funcionario (1234, "Siclano", 234.89);
        Funcionario f3 = new Funcionario (1235, "Beltrano", 23.89);
        Funcionario f4 = new Funcionario (1236, "EU", 2342.89);

        CadastroFuncionarios cads = CadastroFuncionarios.getInstance();
        cads.add(f1);
        cads.add(f2);
        cads.add(f3);
        cads.add(f4);
        
        
        
//        if(cads.saveFile("Funcionario.csv"))
//            System.out.println("Gravação feita com sucesso");
//        else
//            System.out.println("Erro de gravacao");
//        
//        cads.cleanAll();
        
        if(cads.readFile("Funcionario.csv"))
            System.out.println(cads.toString());
        else
            System.out.println("Erro de LEITURA JUMENTO");
        
        
    }
    
}
