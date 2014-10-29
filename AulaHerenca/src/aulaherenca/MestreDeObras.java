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
public class MestreDeObras extends Servente{
    
    private int numFuncionario;

    public MestreDeObras(int numFuncionario, int codigo, String nome, double salarioBruto) {
        super(codigo, nome, salarioBruto);
        this.numFuncionario = numFuncionario;
    }

    public void setNumFuncionario(int numFuncionario) {
        this.numFuncionario = numFuncionario;
    }   

    public int getNumFuncionario() {
        return numFuncionario;
    }
    

    @Override
    public double getSalarioLiquido() {
        return super.getSalarioLiquido() + (numFuncionario / 10) * (super.getSalarioBruto() * 0.1) ; //To change body of generated methods, choose Tools | Templates.
    }
    
}
