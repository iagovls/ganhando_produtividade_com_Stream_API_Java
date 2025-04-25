package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        Desafio12 desafio12 = new Desafio12();

        System.out.println(desafio12.numeros.stream().reduce(1, (n1, n2) -> n1 * n2));

    }
}
//
//Desafio 12 - Encontre o produto de todos os números da lista:
//Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.