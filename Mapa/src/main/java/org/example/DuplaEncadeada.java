package org.example;

public class DuplaEncadeada<T> {
    private class No {
        T data;  //Cada nó possui um campo data que armazena o valor do elemento
        No prev;
        No next;

        No(T data) {
            this.data = data;
        }
    }

    private No head;
    private No tail;
    private int size;

    public void addFirst(T data) {
        No newNo = new No(data);
        if (isEmpty()) {
            head = tail = newNo;
        } else {
            newNo.next = head;
            head.prev = newNo;
            head = newNo;
        }
        size++;
    }

    public void addLast(T data) {
        No newNo = new No(data);
        if (isEmpty()) {
            head = tail = newNo;
        } else {
            newNo.prev = tail;
            tail.next = newNo;
            tail = newNo;
        }
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("A lista está vazia.");
        }

        T data = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return data;
    }

    public T removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("A lista está vazia.");
        }

        T data = tail.data;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
        return data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printList() {
        No current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DuplaEncadeada<Integer> list = new DuplaEncadeada<>();
        list.addLast(1);
        list.addLast(2);
        list.addFirst(0);

        list.printList(); // Deve imprimir: 0 1 2

        list.removeLast();
        list.removeFirst();

        list.printList(); // Deve imprimir: 1
    }
}
