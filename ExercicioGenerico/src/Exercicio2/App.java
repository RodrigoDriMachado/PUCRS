package Exercicio2;




public class App {
    
    public static void main(String args[]){
        
        ProdutoG<Codigo<String, Integer>> p1 = new ProdutoG<>(new Codigo<>("GRAOS", 123), "Arroz", 2.5);
        ProdutoG<Codigo<String, Double>> p2 = new ProdutoG<>(new Codigo<>("GRANJA", 3.1), "Feijao", 3.5);
        
        System.out.println(p1);
        System.out.println(p2);
        
        
    }
    
}
