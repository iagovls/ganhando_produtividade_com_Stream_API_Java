package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio09 {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        Desafio09 desafio09 = new Desafio09();

        boolean temDuplicados = desafio09.numeros.stream().distinct().count() != desafio09.numeros.size();
        System.out.println(!temDuplicados ? "Não tem duplicados" : "Tem Duplicados");
    }
}
//
//Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
//Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.