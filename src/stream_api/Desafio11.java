package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        Desafio11 desafio11 = new Desafio11();

        System.out.println(desafio11.numeros.stream().map(n -> n * n).reduce(0, Integer::sum));
    }
}
//
//Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
//Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.