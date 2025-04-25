package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        Desafio17 desafio17 = new Desafio17();
        System.out.println(desafio17.numeros.stream().filter(desafio17::isPrimo).toList());
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
//Desafio 17 - Filtrar os números primos da lista:
//Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.