import java.util.Arrays;
import java.util.List;

public class Desafio01 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

public static void main(String[] args) {
    Desafio01 desafio01 = new Desafio01();
    desafio01.numeros.stream()
    .distinct() // remove os duplicados
    .sorted() // organiza em ordem. Pode receber um comparator
    .forEach(System.out::println);
}

}

/*Desafio 1 - Mostre a lista na ordem numérica:
Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console. */
