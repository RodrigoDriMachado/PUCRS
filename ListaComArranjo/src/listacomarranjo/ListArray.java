package listacomarranjo;

import java.util.ArrayList;

public class ListArray<E> implements ListTAD<E> {

    private static final int INITIAL_SIZE = 10;
    private E[] data;

    private int count;
    private int capacity;

    /**
     * Construtor da lista
     */
    public ListArray() {
        this(INITIAL_SIZE);
    }

    /**
     * Construtor da lista
     */
    public ListArray(int c) {
        if (c > 0) {
            capacity = c;
        } else {
            capacity = INITIAL_SIZE;
        }
        data = (E[]) new Object[capacity];
        count = 0;
    }

    /**
     * Esvazia a lista
     */
    @Override
    public void clear() {
        data = (E[]) new Object[INITIAL_SIZE];
        count = 0;
        capacity = INITIAL_SIZE;
    }

    /**
     * Retorna true se a lista não contêm elementos
     *
     * @return true se a lista não contêm elementos
     */
    @Override
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna o número de elementos da lista
     *
     * @return o número de elementos da lista
     */
    @Override
    public int size() {
        return count;
    }

    /**
     * Adiciona um elemento ao final da lista
     *
     * @param element elemento a ser adicionado ao final da lista
     */
    @Override
    public void add(E element) {
        if (count == capacity) {
            setCapacity(capacity * 2);
        }
        data[count] = element;
        count++;
    }

    /**
     * Insere um elemento em uma determinada posição da lista
     *
     * @param index a posição da lista onde o elemento será inserido
     * @param element elemento a ser inserido
     * @throws IndexOutOfBoundsException se (index < 0 || index > size())
     */
    @Override
    public void add(int index, E element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index " + index + " deve ser maior que zero e menor que size");
        }
        if (count == capacity) {
            setCapacity(capacity * 2);
        }
        for (int i = count - 1; i >= index; i--) {
            data[i + 1] = data[i];

        }
        data[index] = element;
        count++;
    }

    /**
     * Remove o elemento de uma determinada posição da lista
     *
     * @param index a posição da lista
     * @return o elemento que foi removido da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    
    @Override
    public E remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index = " + index);
        }
        E element = data[index];
        for (int i = index; i < count-1; i++) {
            data[i] = data[i + 1];
        }
        data[count - 1] = null;
        count--;
        return element;
    }

    /**
     * Remove a primeira ocorrência do elemento na lista, se estiver presente
     *
     * @param element o elemento a ser removido
     * @return true se a lista contém o elemento especificado
     */
    @Override
    public boolean remove(E element) {
        for (int i = 0; i < count; i++) {
            if (data[i].equals(element) == true) {
                this.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna o elemento de uma determinada posição da lista
     *
     * @param index a posição da lista
     * @return o elemento da posição especificada
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    @Override
    public E get(int index) {
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException("Index = " + index);
        }
        return data[index];
    }

    /**
     * Substitui o elemento armanzenado em uma determinada posição da lista pelo
     * elemento indicado
     *
     * @param index a posição da lista
     * @param element o elemento a ser armazenado na lista
     * @return o elemento armazenado anteriormente na posição da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    @Override
    public E set(int index, E element) {
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException("Index = " + index);
        }
        data[index] = element;
        E item = data[index];
        return item;
    }

    /**
     * Retorna true se a lista contém o elemento especificado
     *
     * @param element o elemento a ser testado
     * @return true se a lista contém o elemento especificado
     */
    @Override
    public boolean contains(E element) {
        for (int i = 0; i < count; i++) {
            if (data[i].equals(element) == true) {
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna o índice da primeira ocorrência do elemento na lista, ou -1 se a
     * lista não contém o elemento
     *
     * @param element o elemento a ser buscado
     * @return o índice da primeira ocorrência do elemento na lista, ou -1 se a
     * lista não contém o elemento
     */
    @Override
    public int indexOf(E element) {
        // Procura elemento no array, se achar retorna
        for (int p = 0; p < count; p++) {
            if (data[p].equals(element)) {
                return p;
            }
        }
        // Neste ponto, não achou: retorna -1
        return -1;
    }

    private void setCapacity(int newCapacity) {
        if (newCapacity != capacity) {
            int min = 0;
            E[] newData = (E[]) new Object[newCapacity];
            if (capacity < newCapacity) {
                min = capacity;
            } else {
                min = newCapacity;
            }
            for (int i = 0; i < min; i++) {
                newData[i] = data[i];
            }
            data = newData;
            capacity = newCapacity;
        }
    }

    /**
     * Retorna uma sublista com os elementos da lista data no intervalo de
     * indice passado nos parametros caso fromIndex e toIndex forem iguais,
     * deve-se retornar uma sublista vazia.
     *
     */
    public Object[] subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size() || fromIndex > toIndex) {
            throw new ArrayIndexOutOfBoundsException("Indices não são validos " + (toIndex - fromIndex) + "size:" + size());
        }
        Object[] list;
        list = new Object[toIndex - fromIndex];
        if (fromIndex == toIndex) {
            return list;
        } else {
            for (int i = fromIndex, j = 0; i < toIndex; i++, j++) {
                list[j] = data[i];
            }
            return list;
        }
    }

    public void reverse() {
        E[] lista = (E[]) new Object[capacity];
        if (!isEmpty()) {
            lista = data;
            for (int i = 0, j = count - 1; i < count; i++, j--) {
                data[i] = lista[j];
            }
        }
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < count; i++) {
            s.append(data[i].toString());
            if (i != count - 1) {
                s.append(",");
            }

        }
        s.append("]");
        return s.toString();
    }

}
