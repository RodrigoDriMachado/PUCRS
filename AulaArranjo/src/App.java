
public class App {

    public static void main(String[] args) {
        Arranjo a = new Arranjo();
        int array1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int array2[] = {1, 2, 3, 1, 2, 3};
        int array3[] = {2, 2,};
        int array4[] = {1, 3};
        
        int array5[] = {1,2,8,9,5,6,7,3,4};
        int arrayOrdenado[]  = a.getCopiaOrdenada(array5);
        

        
        
        System.out.println("O Array 1 possui elementos distintos? " + a.temElementosDistintos(array1));
        System.out.println("O Array 2 possui elementos distintos? " + a.temElementosDistintos(array2));
        
        System.out.println("O Array 3 possui elementos impares? " + a.temParProdutoImpar(array3));  
        System.out.println("O Array 4 possui elementos impares? " + a.temParProdutoImpar(array4));
        System.out.println("");
        
        for(int i=0;i<arrayOrdenado.length;i++){
            System.out.println("Array Ordenado["+i+"]: " + arrayOrdenado[i]);    
        }
        for(int j=0;j<arrayOrdenado.length;j++){
        System.out.println("Array Original do Array Ordenado["+j+"] é: " + array5[j]);    
        }
        
        /* Atribuos e metodos de classe
                X
           Atribuitos e metodos de instancia              
        */
        Pessoa p1 = new Pessoa("João", 20);
        Pessoa p2 = new Pessoa("Rodrigo", 5);
        CadastroDePessoas.getInstance().add(p1);
        System.out.println("");
        System.out.println("Quantidade de Instancia de Pessoa: " + Pessoa.getQuantidadeDeInstancias());
        
       
        
    }

}
