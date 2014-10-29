package exercicioexcecao;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeProdutos {

    private ArrayList<Produto> cadastro;

    public CadastroDeProdutos() {
        cadastro = new ArrayList<>();
    }

    public void add(String c, int q, float p, String d) {
        Produto prod = new Produto(c, q, p, d);
        cadastro.add(prod);
    }

    public void add(Produto p) {
        cadastro.add(p);
    }

    public boolean remove(String desc) {
        boolean achou = false;
        int i = 0;

        while (!achou && i < cadastro.size()) {
            if (desc.equals(cadastro.get(i).getDescricao())) {
                achou = true;
            } else {
                i++;
            }
        }

        if (achou) {
            cadastro.remove(i);
            return true;
        } else {
            return false;
        }
    }

    public Produto get(String desc) {
        boolean achou = false;
        int i = 0;

        while (!achou && i < cadastro.size()) {
            if (desc.equals(cadastro.get(i).getDescricao())) {
                achou = true;
            } else {
                i++;
            }
        }

        if (achou) {
            return cadastro.get(i);
        } else {
            return null;
        }
    }

    public String getRelatorio() {
        StringBuilder relat = new StringBuilder();

        for (Produto p : cadastro) {
            relat.append(p.toString());
            relat.append("\n");
        }

        return relat.toString();
    }

    public List<Produto> getList() {
        List<Produto> tmp = new ArrayList<>();
        for (Produto c : cadastro) {
            tmp.add(c);
        }
        return tmp;
    }
}
