package Entity;

public class Node<T> {

    T Data;
    Node<T> next;
    Node<T> prev;


    public Node(T data) {
        Data = data;
        this.next = null;
        this.prev = null;
    }
}
