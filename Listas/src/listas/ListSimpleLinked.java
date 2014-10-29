package Listas;

/**
 * Classe ListSimpleLinked: implementa uma lista com encadeamento simples.
 *
 * @version Outubro/2013
 */
public class ListSimpleLinked<E> implements ListTAD<E> {

    // Classe interna Node
    private class Node<T> {

        public T element;
        public Node<T> next;

        public Node(T e) {
            element = e;
            next = null;
        }
    }
    // Referência para o primeiro elemento da lista encadeada.
    private Node<E> head;
    // Referência para o último elemento da lista encadeada.
    private Node<E> tail;
    // Contador para a quantidade de elementos que a lista contem.
    private int count;

    /**
     * Construtor da lista
     */
    public ListSimpleLinked() {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * Adiciona um elemento ao final da lista
     *
     * @param element elemento a ser adicionado ao final da lista
     */
    @Override
    public void add(E element) {
        Node<E> aux = new Node<>(element);
        if (head == null) {
            head = aux;
        } else {
            tail.next = aux;
        }
        tail = aux;
        count++;
    }

    /**
     * Insere um elemento em uma determinada posicao da lista
     *
     * @param index a posicao da lista onde o elemento sera inserido
     * @param element elemento a ser inserido
     * @throws IndexOutOfBoundsException se (index < 0 || index > size())
     */
    @Override
    public void add(int index, E element) throws IndexOutOfBoundsException {
        if (index < 0 || index > count) { // indice invalido
            throw new IndexOutOfBoundsException();
        }
        // Instancia o nodo e coloca o elemento dentro dele
        Node<E> n = new Node<>(element);
        if (index == 0) { // inserção no início
            if (head == null) { //se lista vazia
                tail = n;
            } else {
                n.next = head;
            }
            head = n;
        } // insercao no fim
        else if (index == count) {
            tail.next = n;
            tail = n;
        } // insercao no meio 
        else {
            Node<E> aux = head;
            for (int i = 0; i < (index - 1); i++) {
                aux = aux.next;
            }
            n.next = aux.next;
            aux.next = n;
        }
        count++;
    }

    /**
     * Retorna o elemento de uma determinada posicao da lista
     *
     * @param index a posição da lista
     * @return o elemento da posicao especificada
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    @Override
    public E get(int index) {
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> aux = head;
        int c = 0;
        while (c < index) {
            aux = aux.next;
            c++;
        }
        return (aux.element);
    }

    /**
     * Substitui o elemento armanzenado em uma determinada posicao da lista pelo
     * elemento indicado
     *
     * @param index a posicao da lista
     * @param element o elemento a ser armazenado na lista
     * @return o elemento armazenado anteriormente na posicao da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    @Override
    public E set(int index, E element) {
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> aux = head;
        for (int i = 0; i < index; i++) {
            aux = aux.next;
        }
        E tmp = aux.element;
        aux.element = element;
        return (tmp);

    }

    /**
     * Remove a primeira ocorrencia do elemento na lista, se estiver presente
     *
     * @param element o elemento a ser removido
     * @return true se a lista contem o elemento especificado
     */
    @Override
    public boolean remove(E element) {
        if (head == null) {
            return (false);
        }
        // Se for o primeiro da lista
        if (element.equals(head.element)) {
            if (tail == head) {
                tail = null;
            }
            head = head.next;
            count--;
            return (true);
        }
        // Procura o elemento a ser removido
        Node<E> ant = head;
        Node<E> aux = head.next;
        while (aux != null) {
            if (aux.element.equals(element)) {
                if (aux == tail) {
                    tail = ant;
                }
                ant.next = aux.next;
                count--;
                return (true);
            } else {
                ant = aux;
                aux = aux.next;
            }
        }
        return false;
    }

    /**
     * Retorna true se a lista nao contem elementos
     *
     * @return true se a lista nao contem elementos
     */
    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    /**
     * Retorna o numero de elementos da lista
     *
     * @return o numero de elementos da lista
     */
    @Override
    public int size() {
        return count;
    }

    /**
     * Esvazia a lista
     */
    @Override
    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * Remove o elemento de uma determinada posicao da lista
     *
     * @param index a posicao da lista
     * @return o elemento que foi removido da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    @Override
    public E remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        
        Node<E> aux = head;
        if (index == 0) {
            if (tail == head) // se tiver só um elemento
            {
                tail = null;
            }
            head = head.next;
            count--;
            return aux.element;
        }
        int c = 0;
        while (c < index - 1) {
            aux = aux.next;
            c++;
        }
        E element = aux.next.element;
        if (tail == aux.next) {
            tail = aux;
        }
        aux.next = aux.next.next;
        count--;
        return (element);
    }

    /**
     * Retorna o indice da primeira ocorrencia do elemento na lista, ou -1 se a
     * lista nao contem o elemento
     *
     * @param element o elemento a ser buscado
     * @return o indice da primeira ocorrencia do elemento na lista, ou -1 se a
     * lista nao contem o elemento
     */
    @Override
    public int indexOf(E element) {
        int index = 0;
        Node<E> aux = head;
        while (aux != null) {
            if (aux.element.equals(element)) {
                return (index);
            }
            aux = aux.next;
            index++;
        }
        return -1;
    }

    /**
     * Retorna true se a lista contem o elemento especificado
     *
     * @param element o elemento a ser testado
     * @return true se a lista contem o elemento especificado
     */
    @Override
    public boolean contains(E element) {
        Node<E> aux = head;
        while (aux != null) {
            if (aux.element.equals(element)) {
                return (true);
            }
            aux = aux.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node<E> aux = head;
        for (int i = 0; i < count; i++) {
            s.append(aux.element.toString());
            s.append("\n");
            aux = aux.next;
        }
        return s.toString();
    }
}
