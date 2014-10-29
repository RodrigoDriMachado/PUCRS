/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulaherenca;

/**
 *
 * @author 12280437
 */
public class App {
    
    public static void main(String[] args) {
        
        Funcionario mot1 = new Motorista("2050468893", 20, "Lucas", 1000.00);
        Funcionario s1 = new Servente(15, "Rosangela", 860.00);
        Funcionario mest1 = new MestreDeObras(10, 1, "Maria", 2000.00);

        
        
        System.out.println(mest1.toString());
        System.out.println("");
        System.out.println(mot1.toString());
        System.out.println("");
        System.out.println(s1.toString());
        System.out.println("");
        
        
        
        
    }
    
}
