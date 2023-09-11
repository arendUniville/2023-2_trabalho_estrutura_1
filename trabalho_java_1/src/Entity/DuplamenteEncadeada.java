package Entity;

public class DuplamenteEncadeada<T> {

    private Node<T> head;
    private Node<T> tail;


    public DuplamenteEncadeada() {
        this.head = null;
        this.tail = null;
    }



    //Add no início
    public void prepend(T data) {

        Node<T> newNode = new Node<>(data);

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
    public void append(T data) {

        Node<T> newNode = new Node<>(data);

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
    public void delete(T data) {

        Node<T> atual = head;

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



    //Amostragem----------------------------------------------------------
    // Método para obter o nó da cabeça (head) da lista
    public Node<T> getHead() {
        return head;
    }

    // Método para obter o nó da cauda (tail) da lista
    public Node<T> getTail() {
        return tail;
    }


    public void mostrarLista() {

        Node<T> atual = head;

        while (atual != null) {
            System.out.print(atual.Data + " ");
            atual = atual.next;
        }

        System.out.println();
    }





    //Exemplo----------------------------------------------------------
    public static void Exemplo(){

        DuplamenteEncadeada<Integer> lista = new DuplamenteEncadeada<>();

        lista.append(1); // [1] (+1)
        lista.append(2); // [1,2] (+2)
        lista.append(3); // [1,2,3] (+3)
        lista.prepend(0); // [0, 1, 2, 3] (+0)
        lista.mostrarLista(); // Deve imprimir: 0 1 2 3
        lista.delete(2); // [0, 1, 3] (-2)
        lista.mostrarLista(); // Deve imprimir: 0 1 3

    }

}
