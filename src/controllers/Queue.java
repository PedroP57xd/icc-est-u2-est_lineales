package controllers;

import models.Node;

public class Queue<T> {
    private Node<T> first;
    private Node<T> last;
    private int size=0;

    public Queue() {
        this.first = null;
        this.last = null;
    }

    public void enqueue(T data){
        Node<T> newNode = new Node<T>();
        newNode.setValue(data);
        if (isEmpty()) {
            first=newNode;
            last=newNode;
        } else{
            last.setNext(newNode);
            last=newNode;
        }
        size++;
        
    }

    public boolean isEmpty(){
        return first==null;
    }

    public T dequeue(){
        if (isEmpty()) {
            return null;
        }
        T data = first.getValue();
        first=first.getNext();
        if (isEmpty()) {
            last=null;
        }
        size--;
        return data;
    }

    public void printAllNodes(){
        Node<T> current = first;
        System.out.print("primero -> ");
        while (current!=null) {
            System.out.print(current.getValue()+ " -> ");
            current = current.getNext();
        }
        System.out.println("FIN");
    }
    public int size(){
        return size;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

}
