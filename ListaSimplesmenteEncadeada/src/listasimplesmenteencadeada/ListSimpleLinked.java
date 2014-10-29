/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimplesmenteencadeada;

/**
 *
 * @author RODRIGO
 */
public class ListSimpleLinked<E> implements ListTAD<E> {

    private Node<E> head;
    private Node<E> tail;
    private int count;

    private class Node<T> {

        public T element;
        public Node<T> next;

        public Node(T e) {
            element = e;
            next = null;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

    }

    @Override
    public void add(E element) {
        Node<E> novoNodo = new Node(element);

        if (isEmpty()) {
            head = novoNodo;
            tail = novoNodo;
            count++;
        } else {
            tail.next = novoNodo;
            tail = novoNodo;
            count++;
        }
    }

    @Override
    public void add(int index, E element) {
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> novoNodo = new Node(element);
        if (index == 0) {
            if (isEmpty()) {
                head.next = novoNodo;
                tail = novoNodo;
                count++;
            }
        } else {
            Node<E> aux = head;
            Node<E> ant = null;
            for (int i = 0; i < count; i++) {
                if (i == index) {
                    ant.next = novoNodo;
                    novoNodo.next = aux;
                    count++;
                    return;
                } else {
                    ant = aux;
                    aux = aux.next;
                }
            }
        }
    }

    @Override
    public E get(int index) {
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException();
        } else {
            Node<E> aux = head;
            int c = 0;
            while (c < index) {
                aux = aux.next;
                c++;
            }
            return (aux.element);
        }

    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Remoção de elemento passando elemento como parametro Se faz um laço de
     * repetição até achar o elemento, guardando nas variáveis aux a referencia
     * para o nodo atual da lista e na variavel ant o nodo anterior ao aux
     * podendo dessa forma ligar o nodo anterior com o proximo nodo depois de
     * aux
     *
     * @param element
     * @return
     */
    @Override
    public boolean remove(E element) {
        if (head.element.equals(element)) {
            head = head.next;
            count--;
            return true;
        } else {
            Node<E> aux = head;
            Node<E> ant = null;
            for (int i = 0; i < count; i++) {
                if (aux.getElement().equals(element)) {
                    if (aux == tail) {
                        tail = ant;
                        ant.next = null;
                        count--;
                        return true;
                    } else {
                        ant.next = aux.next;
                        aux.next = null;
                    }

                }
            }
        }
        
        return false;
    }

    @Override
    public E remove(int index) {
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            E element = head.element;
            head = head.next;
            if(count==1){
                tail=null;
            }
            count --;
            return element;
        }
        Node<E> aux = head;
        for(int i=0; i<index-1;i++){
            aux=aux.next;
        }
        if(index==count-1){
            aux.next=null;
            E element = tail.element;
            tail = aux;
            count --;
            return element;
        }
        E element = aux.next.element;
        aux.next=aux.next.next;
        count--;
        return element;
    }

    @Override
    public boolean isEmpty() {
        if (head.next == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(E element) {
        Node<E> aux = head;
        for (int i = 0; i < count; i++) {
            if (aux.element.equals(element)) {
                return true;
            } else {
                aux = aux.next;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E element) {
        Node<E> aux = head.next;
        for (int i = 1; i < count; i++) {
            if (aux.element.equals(element)) {
                return i;
            } else {
                aux = aux.next;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
