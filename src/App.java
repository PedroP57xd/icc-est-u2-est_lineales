
import controllers.Stack;
import models.Node;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {

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
}
