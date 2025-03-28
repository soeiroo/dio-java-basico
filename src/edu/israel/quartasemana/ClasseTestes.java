package edu.israel.quartasemana;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class ClasseTestes {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5);
    numbers.forEach(number -> System.out.println(number));


    // Exemplo de uso de lambda

    BiFunction<Integer, Integer, Integer> sumNumbers = (number1, number2) -> number1 + number2;
    Integer sumResult = sumNumbers.apply(numbers.get(2), numbers.get(4));
    System.out.println(sumResult);

  }
}
