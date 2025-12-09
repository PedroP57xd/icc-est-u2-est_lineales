package controllers;

import models.Node;

public class Stack<T> {// Pila (LIFO)
    private Node<T> top;
    private int size;


    public Stack() {
        this.top = null;
        this.size=0;
    }

    //Metodo para insertar(Push)
    public void push(T data){

        Node<T> newNode = new Node<T>();
        newNode.setValue(data);
        newNode.setNext(top);
        top=newNode;
        size++;

    }

    //Metodo para sacar y/o Eliminar(Pop) 
    public T pop(){
        if (top== null) {
            return null;
        }
        T data= top.getValue();
        top=top.getNext();
        size--;
        return data;
    }

    //Metodo para retornar el primero pero sin eliminar
    public T peek(){
        // if (top== null) {
        //     return null;
        // }
        // T data= top.getValue();
        // return data;
        if (top== null) {
            return null;
        }
        T data= top.getValue();
        return data;
    }

    public boolean isEmpty(){
        return top==null;
    }

    public  int size(){
        // if (isEmpty()) {
        //     return 0;
        // }
        // int cont=1;
        // Node<T> aux =top;
        // while (aux.getNext()!=null) {
        //     aux=aux.getNext();
        //     cont++;
        // }
        return size;
    }

    public void printAllNodes(){
        Node<T> current = top;
        System.out.print("cima -> ");
        while (current!=null) {
            System.out.print(current.getValue()+ " -> ");
            current = current.getNext();
        }
        System.out.println("FIN");
    }

    public Node<T> getTop() {
        return top;
    }

    public void setTop(Node<T> top) {
        this.top = top;
    }

    

}