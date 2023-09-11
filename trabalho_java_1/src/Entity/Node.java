package Entity;

public class Node {

    int Data;
    Node prev;
    Node next;


    public Node(int data) {
        Data = data;
        this.prev = null;
        this.next = null;
    }
}
