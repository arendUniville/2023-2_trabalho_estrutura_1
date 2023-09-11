package Entity;

public class DuplamenteEncadeada {

    private Node head;
    private Node tail;


    public DuplamenteEncadeada() {
        this.head = null;
        this.tail = null;
    }



    //Add no início
    public void prepend(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }


    //Add no final
    public void append(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

    }


    //Remove
    public void delete(int data) {

        Node atual = head;

        while (atual != null) {

            if (atual.Data == data) {

                if (atual.prev != null) {
                    atual.prev.next = atual.next;
                } else {
                    head = atual.next;
                }

                if (atual.next != null) {
                    atual.next.prev = atual.prev;
                } else {
                    tail = atual.prev;
                }

                return;
            }
            atual = atual.next;
        }
    }



    //Amostragem

    public void mostrarLista() {

        Node atual = head;

        while (atual != null) {
            System.out.print(atual.Data + " ");
            atual = atual.next;
        }

        System.out.println();
    }



}
