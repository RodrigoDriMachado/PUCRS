package praticaarquivorandon;

import java.util.Random;

public class Numero {

    private int numero;
    Random r;

    public Numero() {
        r = new Random();
        numero = 0 + r.nextInt(100);
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numero{" + "numero=" + numero + '}';
    }


}
