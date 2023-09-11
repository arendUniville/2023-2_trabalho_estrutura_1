package Entity;

import java.util.NoSuchElementException;

public class Mapa<K, V> {

    private DuplamenteEncadeada<MapNode<K, V>> lista;


    public Mapa() {
        this.lista = new DuplamenteEncadeada<>();
    }




    // Adicionar um par mapNode ao mapa
    public void put(K key, V value) {
        MapNode<K, V> pair = new MapNode<>(key, value);
        lista.append(pair);
    }

    // Remover um par chave-valor do mapa
    public void remove(K key) {
        Node<MapNode<K, V>> current = lista.getHead();
        while (current != null) {
            MapNode<K, V> pair = current.Data;
            if (pair.key.equals(key)) {
                lista.delete(pair);
                return;
            }
            current = current.next;
        }
    }




    // Verifica se uma chave está no mapa
    public boolean containsKey(K key) {

        Node<MapNode<K, V>> current = lista.getHead();

        while (current != null) {

            MapNode<K, V> pair = current.Data;

            if (pair.key.equals(key)) {
                return true;
            }

            current = current.next;

        }

        return false;
    }





    //Pega o valor associado a uma chave
    public V get(K key) {

        Node<MapNode<K, V>> current = lista.getHead();

        while (current != null) {

            MapNode<K, V> pair = current.Data;

            if (pair.key.equals(key)) {
                return pair.value;
            }

            current = current.next;

        }
        throw new NoSuchElementException("Chave não encontrada no mapa");
    }




    // Método para imprimir o mapa
    public void printMap() {

        Node<MapNode<K, V>> current = lista.getHead();

        while (current != null) {

            MapNode<K, V> pair = current.Data;

            System.out.println(pair.key + ": " + pair.value);
            current = current.next;

        }
    }

}
