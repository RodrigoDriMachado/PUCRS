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
public class Servente extends Funcionario {

    public Servente(int codigo, String nome, double salarioBruto) {
        super(codigo, nome, salarioBruto);
    }

    @Override
    public double getSalarioLiquido() {
        return super.getSalarioLiquido() + (0.05 * super.getSalarioBruto()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
