
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 12280437
 */
public class Arranjo {

    /*
     Apresente a implementação de um método que verifica se
     todos os números de um array de inteiros recebido por
     parâmetro são diferentes uns dos outros (em outras
     palavras, se o array contém elementos distintos). A
     assinatura do método é apresentada abaixo. Depois de
     finalizado, teste a sua implementação.
     */
    public boolean temElementosDistintos(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }

        }

        return true;
    }
    /*
     Apresente a implementação de um método que recebe por
     parâmetro um array de inteiros e determina se tem um par
     de números no array em que o produto é um número ímpar.
     A assinatura do método é apresentada abaixo. Depois de
     finalizado, teste a sua implementação.
     */

    public boolean temParProdutoImpar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[j] * array[i]) % 2 == 1) {
                    return true;
                }
            }
        }
        return false;
    }
    /*
        Implemente um método que recebe um array de inteiros
        por parâmetro retorna uma cópia deste array ordenado do
        maior para o menor. O array passado por parâmetro não
        deve ser alterado. A assinatura do método é apresentada
        abaixo. Depois de finalizado, teste a sua implementação.
    */
    public int[] getCopiaOrdenada(int[] array) {
        //cria copia do array
        int[] array2 = array.clone();
        //ordena a copia em ordem crescente
        Arrays.sort(array2);
        //variavel auxiliar para controlar a ultima posição do array
        int j = array.length - 1;
        //percorrendo o array do inicio para o fim
        for (int i = 0; i < array2.length / 2; i++) {
            //criadno uma variavel auxiliar para efetuar a troca dos valores
            int aux;
            //obtem o valor da posição do array correspondente a variavel i
            aux = array2[i];
            //troca o valor do array na posição i pela posição j
            array2[i] = array2[j];
            //troca o valor do array na posição j pela posição aux
            array2[j] = aux;
            //decrementa o valor de j
            j--;

        }
        return array2;
    }

}
