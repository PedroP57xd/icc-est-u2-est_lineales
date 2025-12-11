
import controllers.ListaEnlazada;
import controllers.Queue;

import controllers.Stack;
import models.Node;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        // runStack();
        // runQueue();
        runLinkedListExample();

        // Node<Person> node1 = new Node<Person>(new Person("Juan", 30));
        // Node<Person> node2 = new Node<Person>(new Person("Maria", 35));
        // Node<Person> node3 = new Node<Person>(new Person("Pepito", 20));
        // Node<Person> node4 = new Node<Person>(new Person("Diego", 10));

        // valor -> next
        // Node<Person> current = node1;
        // while (current != null) {
        // System.out.println("Valor: " + current.getValue() + "-> Ref: " +
        // current.getNext().getValue() + "\n");
        // current = current.getNext();
        // }

    }

    public static void runStack() {
        Stack<Person> pila = new Stack<Person>();
        pila.push(new Person("Juan", 30));
        pila.push(new Person("Maria", 35));
        pila.push(new Person("Pepito", 20));
        pila.push(new Person("Diego", 10));

        System.out.println("Size= " + pila.size());
        pila.printAllNodes();
        System.out.println(pila.pop());
        System.out.println("Size= " + pila.size());
        pila.printAllNodes();
    }

    public static void runQueue() {
        Queue<Person> cola = new Queue<Person>();

        cola.enqueue(new Person("Juan", 30));
        cola.enqueue(new Person("Maria", 35));
        cola.enqueue(new Person("Pepito", 20));
        cola.enqueue(new Person("Diego", 10));

        System.out.println("Size=" + cola.size());
        cola.printAllNodes();
        System.out.println(cola.dequeue());
        System.out.println("Primera" + cola.getFirst());
        System.out.println("Ultima" + cola.getLast());
        System.out.println("Size=" + cola.size());
        cola.printAllNodes();
    }

    public static void runLinkedListExample() {
        ListaEnlazada<Person> persons = new ListaEnlazada<Person>();
        persons.append(new Person("Juan", 30));
        persons.append(new Person("Maria", 35));
        persons.append(new Person("Pepito", 32));
        persons.append(new Person("Diego", 31));
        System.out.println("Size=" + persons.size());
        persons.printAllNodes();
        persons.deleteNode(new Person("Pepito", 32));
        persons.printAllNodes();
        persons.deleteFirst();
        persons.printAllNodes();
        persons.deleteLast();
        persons.printAllNodes();
        System.out.println("Size=" + persons.size());
    }
}
