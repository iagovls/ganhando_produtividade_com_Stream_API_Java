package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        Desafio19 desafio19 = new Desafio19();
        System.out.println(desafio19.numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).mapToInt(Integer::intValue).reduce(Integer::sum));

    }
}
//
//Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
//Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
