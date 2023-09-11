import Entity.DuplamenteEncadeada;
import Entity.Mapa;

public class Main {
    public static void main(String[] args) {

        //new DuplamenteEncadeada().Exemplo();



        Mapa<String, Integer> mapa= new Mapa<>();
        mapa.put("Valor1", 1);
        mapa.put("Valor2", 2);
        mapa.put("Valor3", 3);


        //Mostrando mapa
        System.out.println("\n\nValores do mapa:");
        mapa.printMap();

        //Mostrando valor da chave 2
        System.out.println("Valor 2: " + mapa.get("Valor2"));


        //Removendo chave 1
        mapa.remove("Valor1");

        //Mostrando mapa novamente
        System.out.println("\n\nRemovido 'Valor1':");
        mapa.printMap();


    }

}