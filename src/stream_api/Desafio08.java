package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio08 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        Desafio08 desafio08 = new Desafio08();
        System.out.println(desafio08.numeros.stream().reduce(0, Integer::sum));

    }
}
//
//Desafio 8 - Somar os dígitos de todos os números da lista:
//Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
