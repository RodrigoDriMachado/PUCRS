package praticaarquivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroFuncionarios {

    private ArrayList<Funcionario> lista;
    private static CadastroFuncionarios cad = null;

    private CadastroFuncionarios() {
        lista = new ArrayList<>();
    }

    public static CadastroFuncionarios getInstance() {
        if (cad == null) {
            cad = new CadastroFuncionarios();
        }
        return cad;
    }

    public void cleanAll() {
        lista = new ArrayList<>();
    }

    public boolean add(Funcionario f) {
        return lista.add(f);
    }

//    public boolean saveFile(String nomeArq) {
//        Path path1 = Paths.get(nomeArq);
//        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path1, Charset.defaultCharset()))) {
//            for (Funcionario f : lista) {
//                writer.println(f.getCodigo() + ";" + f.getNome() + ";" + f.getSalarioBruto());
//            }
//        } catch (IOException e) {
//            return false;
//        }
//        return true;
//
//    }

    public boolean readFile(String nomeArq) {
        Path path = Paths.get(nomeArq);
        
        try (Scanner sc = new Scanner(Files.newBufferedReader(path, Charset.defaultCharset()))) {
            String str = null, nome = null;
            int cod=0;
            double sald=0;
            sc.useDelimiter("[;\\n]"); // separadores: ; e nova linha
            while (sc.hasNext()) {
                str = sc.next();
                cod = Integer.parseInt(str);
                nome = sc.next();
                str =  sc.next();
                sald = Double.parseDouble(str);
                Funcionario f = new  Funcionario (cod, nome, sald);
                lista.add(f);
            }
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CadastroFuncionarios{" + "\n lista=" + lista + '}';
    }
}
