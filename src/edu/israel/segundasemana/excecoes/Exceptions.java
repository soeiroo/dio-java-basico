package edu.israel.segundasemana.excecoes;

public class Exceptions {
  public static void main(String[] args) {
    int [] numbers = {1, 2, 3, 4, 5};
    try{
      System.out.println(numbers[6]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println("Error: " + e.getMessage());
    }
  }
}
