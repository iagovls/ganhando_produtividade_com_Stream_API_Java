package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio04 {
    List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, -6, -7, 8, 9, -10, 5, -4, 3);

    public static void main(String[] args) {
        Desafio04 desafio04 = new Desafio04();

        desafio04.numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}


//
//Desafio 4 - Remova todos os valores ímpares:
//Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.