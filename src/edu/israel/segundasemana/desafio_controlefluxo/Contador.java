package edu.israel.segundasemana.desafio_controlefluxo;

import java.util.Scanner;

public class Contador {
  public static void main(String[] args) throws NumeroInvalidoException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    int numeroUm = scanner.nextInt();
    System.out.println("Digite o segundo número: ");
    int numeroDois = scanner.nextInt();

    try{
      contadorDeNumeros(numeroUm, numeroDois);
    } catch (NumeroInvalidoException e){
      System.err.println("O segundo número tem que ser maior que o primeiro");
    }

  }

  static void contadorDeNumeros(int numeroUm, int numeroDois) throws NumeroInvalidoException {
    if (numeroUm > numeroDois){
      int numerosTotais = numeroUm - numeroDois;
      for (int indice = 1; indice < numerosTotais; indice++){
        System.out.println("Quantidade de iterações: " + indice);
      }
    } else {
      throw new NumeroInvalidoException();
    }


  }
}
