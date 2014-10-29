package Exercicio2;

/**
 * Imagine que uma empresa codifica seus produtos em 2 partes: 
 * As letras indicam o setor onde o produto é fabricado e os números 
 * correspondem a um identificador dentro do setor. Ex: “IMP34”, 
 * “SEC1413” etc. Crie uma classe chamada Codigo para representar 
 * estes códigos e instancie a classe ProdutoG vista anteriormente
 * usando a classe Codigo como tipo do código do produto.
 * @author 12280437
 */

public class Codigo<T,U> {
    
    
    private T p1;
    private U p2;
    
    public Codigo(T p1, U p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    
    public T getP1() {
        return p1;
    }

    public U getP2() {
        return p2;
    }


    @Override
    public String toString() {
        return "Codigo{" + p1  + p2 + "" + '}';
    }
    
    
    
    
}
