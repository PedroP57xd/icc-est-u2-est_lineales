package controllers;

import models.Node;

public class ListaEnlazada<T> {
    private Node<T> head;
    private int size = 0;

    public ListaEnlazada() {
        this.head = null;
    }

    public void append(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            size++;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node<T>(data));
            size++;
        }
    }

    public void deleteFirst() {
        if (head != null) {
            head=head.getNext();
            size--;
        }
    }

    public void deleteLast() {
        if (head == null) {
            return;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current.setNext(null);
            }
            size--;
        }
    }

    public void deleteNode(T data) {
        if (head == null) {
            System.out.println("ERROR -> No hay datos");
        } else if (data == head.getValue()) {
            System.out.println("ERROR -> Elimina head");
        } else {

            Node<T> current = head;
            while (current.getNext().getValue() == data) {
                current.setNext(current.getNext().getNext());
            }
            size--;

        }
    }

    public int size() {
        return size;
    }

    public void printAllNodes() {
        Node<T> current = head;
        System.out.print("primero -> ");
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("FIN");
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

}
