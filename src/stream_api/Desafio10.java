package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        Desafio10 desafio10 = new Desafio10();
        List<Integer> multiplos3ou5 = new ArrayList<>(desafio10.numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).toList());
        System.out.println(multiplos3ou5);
    }
}
//
//Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
//Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.