package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio14 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        Desafio14 desafio14 = new Desafio14();
        System.out.println(desafio14.numeros.stream().filter(desafio14::isPrimo).max(Integer::compareTo).orElse(0));
    }

    private boolean isPrimo(Integer numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
//
//Desafio 14 - Encontre o maior número primo da lista:
//Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.