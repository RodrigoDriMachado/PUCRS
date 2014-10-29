/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praticaarquivorandon;

/**
 *
 * @author 12280437
 */
public class App {
    
    public static void main(String[] args) {
        
        CadsatroNumero cads = CadsatroNumero.getInstance();
 
        
        
        if(cads.saveFile("Numeros.txt"))
            System.out.println("Gravação feita com sucesso");
        else
            System.out.println("Erro de gravacao");
        
        cads.cleanAll();
        
        if(cads.readFile("Numeros.txt"))
            System.out.println(cads.toString());
        else
            System.out.println("Erro de LEITURA JUMENTO");
        
        
    }
    
}
