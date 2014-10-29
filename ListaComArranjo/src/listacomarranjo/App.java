package listacomarranjo;

public class App {

    public static void main(String[] args) {
        ListTAD<String> lista = new ListArray<>();
        lista.add("Gato");
        lista.add("Cachorro");
        lista.add("Tigre");
        lista.add("Pato");
        lista.add("Rato");
        lista.add(0, "Elefante");

        System.out.println("Primeiro caractere da primeira palavra: "
                + ((String) lista.get(0)).charAt(0));

        System.out.println("indexOf Tigre = " + lista.indexOf("Tigre"));

        System.out.println("Lista Original: ");

        System.out.println("");

        System.out.println(lista.toString());
        

        
        /*
        lista.remove("Pato");

        System.out.println("");

        System.out.println("Lista Sem Pato por element:");

        System.out.println("");

        System.out.println(lista.toString());

        lista.remove(4);

        System.out.println("");

        System.out.println("Lista Sem Rato por indice \n");

        System.out.println("Lista data: \n");

        System.out.println(lista.toString());

        Object array[] = ((ListArray) lista).subList(2, 4);

        System.out.println("");

        System.out.println("SubLista: \n");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/

    }

}
