package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio05 {
    List<Integer> numeros = Arrays.asList(6,6,6,6,6,6);

    public static void main(String[] args) {
        Desafio05 desafio05 = new Desafio05();
        ;
        System.out.println(desafio05.numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue).average());
    }

    
}
//
//Desafio 5 - Calcule a média dos números maiores que 5:
//Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.