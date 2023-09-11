import Entity.DuplamenteEncadeada;

public class Main {
    public static void main(String[] args) {


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