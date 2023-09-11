package Entity;

import java.util.NoSuchElementException;

public class Mapa<K, V> {

    private DuplamenteEncadeada<MapNode<K, V>> lista;


    public Mapa() {
        this.lista = new DuplamenteEncadeada<>();
    }



//Métodos---------------------------------------------------------------
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




//Amostragem--------------------------------------------------------------

    // Método para imprimir o mapa
    public void mostrarMapa() {

        Node<MapNode<K, V>> current = lista.getHead();

        while (current != null) {

            MapNode<K, V> pair = current.Data;

            System.out.println(pair.key + ": " + pair.value);
            current = current.next;

        }
    }


//Exemplo

    public void examplo(){

        System.out.println("=================\n      MAPA \n=================");

        Mapa<String, Integer> mapa= new Mapa<>();
        mapa.put("Valor1", 1);
        mapa.put("Valor2", 2);
        mapa.put("Valor3", 3);


        //Mostrando mapa
        System.out.println("\nValores do mapa:");
        mapa.mostrarMapa();

        //Mostrando valor da chave 2
        System.out.println("Valor 2: " + mapa.get("Valor2"));


        //Removendo chave 1
        mapa.remove("Valor1");

        //Mostrando mapa novamente
        System.out.println("\nRemovido 'Valor1':");
        mapa.mostrarMapa();

        System.out.println("\n\n\n");
    }


}
