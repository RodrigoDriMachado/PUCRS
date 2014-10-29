package Listas;

public class App {

    public static void main(String[] args) {
        // Código para teste da implementação dos métodos da lista
        ListTAD<String> lista1 = new ListSimpleLinked<>();
        lista1.add("Gato");
        lista1.add("Cachorro");
        lista1.add("Tigre");
        lista1.add("Pato");
        lista1.add("Rato");
        lista1.add(0, "Elefante");
        lista1.add(2, "Leao");

        for (int i = 0; i < lista1.size(); i++) {
            System.out.print(lista1.get(i).toString() + " ");
        }
        System.out.println("");
        
        System.out.println("Primeiro caractere da primeira palavra: "
                + ((String) lista1.get(0)).charAt(0));

        System.out.println("indexOf Tigre = " + lista1.indexOf("Tigre"));

        lista1.set(1, "Gato Persa");

        lista1.remove("Elefante");
        lista1.remove(3);
        
        System.out.println(lista1);
        
        System.out.println("\n");
        
        ListArray<String> lista2 = new ListArray<>();
        lista2.add("Pêra");
        lista2.add("Maçã");
        lista2.add("Uva");
        lista2.add(0, "Laranja");        
        lista2.add("Melão");
        lista2.add("Banana");
        lista2.add(2, "Abacate");
        lista2.add(5, "Kiwi");

        for (int i = 0; i < lista2.size(); i++) {
            System.out.println(lista2.get(i).toString());
        }    
        
        Object sublist[] =  lista2.subList(2,6);
        System.out.print("Sublist: ");
        for (int i = 0; i < sublist.length; i++) {
            System.out.print(sublist[i] + " ");
        }         
        System.out.println("");
        
        lista2.remove("Banana");
        lista2.remove(0);  
        
        System.out.println(lista2);
    }
}
