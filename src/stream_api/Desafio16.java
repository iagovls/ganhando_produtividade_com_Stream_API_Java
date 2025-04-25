package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio16 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        Desafio16 desafio16 = new Desafio16();
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();
        numerosPares = desafio16.numeros.stream().filter(n -> n % 2 == 0).toList();
        numerosImpares = desafio16.numeros.stream().filter(n -> n % 2 != 0).toList();
        System.out.println("Números Pares: " + numerosPares);
        System.out.println("Números Impares" + numerosImpares);
    }
}
//
//Agrupe os números em pares e ímpares:
//Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
