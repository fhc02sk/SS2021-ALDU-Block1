package linkedlist;

// Knoten / Container-Klasse
public class Node<T>
{
    private final T value;

    private Node<T> next; // Zeiger / Pointer / Nachfolger

    public Node(T value) {

        this.value = value;
    }

    public T getValue() {
        // changes
        return null;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
