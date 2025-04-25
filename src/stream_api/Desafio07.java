package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio07 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        Desafio07 desafio07 = new Desafio07();
        System.out.println(desafio07.numeros.stream().sorted((a, b) -> b - a).skip(1).findFirst().orElse(null));

    }
}
//
//Desafio 7 - Encontrar o segundo número maior da lista:
//Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
