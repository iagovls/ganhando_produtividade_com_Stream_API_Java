package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        Desafio15 desafio15 = new Desafio15();
        System.out.println(desafio15.numeros.stream().anyMatch(n -> n < 0) ? "Tem números negativos" : "Não tem números negativos");
    }
}
//
//Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
//
//Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.