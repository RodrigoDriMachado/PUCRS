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
public class Motorista extends Funcionario {
    
    private String cnh;

    public Motorista(String cnh, int codigo, String nome, double salarioBruto) {
        super(codigo, nome, salarioBruto);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return super.toString() + " CNH: " + cnh; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
