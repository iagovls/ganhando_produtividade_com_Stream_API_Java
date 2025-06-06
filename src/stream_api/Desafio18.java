package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        Desafio18 desafio18 = new Desafio18();
        System.out.println(desafio18.numeros.stream().distinct().count() == 1 ? "Todos os números são iguais" : "Nem todos os números são iguais");
    }
}
//
//Desafio 18 - Verifique se todos os números da lista são iguais:
//Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.