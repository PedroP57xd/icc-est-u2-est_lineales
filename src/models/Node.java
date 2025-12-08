package models;

public class Node<T> {
    private T value;
    private Node<T> next;//Referencia del siguiente nodo
    private Node<T> previus;




    public Node() {
    }

    public Node(T value) {
        this.value = value;
        this.next = null;
        this.previus = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevius() {
        return previus;
    }

    public void setPrevius(Node<T> previus) {
        this.previus = previus;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + ", next=" + next + ", previus=" + previus + "]";
    }



}