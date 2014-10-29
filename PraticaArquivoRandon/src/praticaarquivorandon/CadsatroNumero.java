package praticaarquivorandon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CadsatroNumero {

    private ArrayList<Integer> lista;
    private static CadsatroNumero cad = null;
   

    private CadsatroNumero() {
        lista = new ArrayList<>();
     
    }

    public static CadsatroNumero getInstance() {
        if (cad == null) {
            cad = new CadsatroNumero();
        }
        return cad;
    }

     
    public void cleanAll() {
        lista = new ArrayList<>();
    }

    public boolean add(Integer f) {
        return lista.add((int)f);
    }

    public boolean saveFile(String nomeArq) {
        Path path1 = Paths.get(nomeArq);
       
        
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path1, Charset.defaultCharset()))) {
             for(int i = 1; i <= 100; i++){
                Numero n = new Numero();
                writer.println(n.getNumero() + ",");
            }
        } catch (IOException e) {
            return false;
        }
        return true;

    }

    public boolean readFile(String nomeArq) {
        Path path = Paths.get(nomeArq);
        
        try (Scanner sc = new Scanner(Files.newBufferedReader(path, Charset.defaultCharset()))) {
            String str = null;
            int num=0;
            sc.useDelimiter("[;\\n]"); // separadores: ; e nova linha
            while (sc.hasNext()) {
                 str = sc.next();
                num = Integer.parseInt(str);
                lista.add(num);
            }
        } catch (IOException e) {
            return false;
        }
        return true;
    }
    
    public int getQuantideNumeroPar(){
        int n;
        n=0;
        for(int i=0; i < lista.size(); i++){
            if(lista.get(i) % 2 == 0){
                n++;
            }
        }
        return n;
    }

    public int getQuantideNumeroImpar(){
        int n;
        n=0;
        for(int i=0; i < lista.size(); i++){
            if(lista.get(i) % 2 == 1){
                n++;
            }
        }
        return n;
    }
    
    @Override
    public String toString() {
        return "Lista de Numeros{" + "\nlista=" + lista + "/n" + 
                "Quantidade de Numero Par" + getQuantideNumeroPar() +
                "Quantidade de Numero Impares" + getQuantideNumeroImpar() + 
                 '}';
    }
}
