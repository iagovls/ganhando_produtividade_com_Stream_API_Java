package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio06 {
    List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, -6, -7, 8, 9, -10, 50, -4, 3);

    public static void main(String[] args) {
        Desafio06 desafio06 = new Desafio06();
        desafio06.numeros.stream().filter(n -> n > 10).forEach(System.out::println);

    }
}
//
//Desafio 6 - Verificar se a lista contém algum número maior que 10:
//Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
