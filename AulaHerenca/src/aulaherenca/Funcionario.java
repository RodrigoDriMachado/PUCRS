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
public abstract class Funcionario  {

    private String nome;
    private int codigo;
    private double salarioBruto;

    public Funcionario(int codigo, String nome, double salarioBruto) {
        this.codigo = codigo;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        double inss = salarioBruto * 0.1;
        double ir = 0.0;
        if (salarioBruto > 2000.0) {
            ir = (salarioBruto - 2000.0) * 0.12;
        }
        return (salarioBruto - inss - ir);
    }
    
    @Override
    public boolean equals(Object obj){
        //verifica se a referencia do objeto "OBJ" esta nula
        if(obj==null)
            //se esta nulo retora false e sai do metodo
            return false;
        //verifica se o objeto esta apontando para uma instancia de funcionario
        if(obj instanceof Funcionario == false)
            //se esta nulo retora false e sai do metodo
            return false;
        //força o objeto f ser um objeto do tipo funcionario
        Funcionario f = (Funcionario) obj;
        //valida se o codigo desta classe(atributo) é igual ao codigo do funcionario "F"
        if(this.codigo == f.codigo)
            return true;
        else
            return false;
        
        }
  
    @Override
    public String toString() {
        return (getClass().getSimpleName() + "\n Codigo: " + getCodigo()
                + "\n Nome: " + getNome() + "\n Salario Bruto: " + getSalarioBruto()
                + "\n Salario liquido: " + getSalarioLiquido());
    }
}
