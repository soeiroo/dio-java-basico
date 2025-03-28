package edu.israel.terceirasemana;

import java.util.Scanner;

public class Autodromo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Carro carro = new Carro();
    while (true){
      System.out.println("Digite o comando desejado: ");
      System.out.println("1 - Ligar o carro");
      System.out.println("2 - Desligar o carro");
      System.out.println("3 - Acelerar o carro");
      System.out.println("4 - Desacelerar o carro");
      System.out.println("5 - Virar o carro");
      System.out.println("6 - Frear Carro");
      System.out.println("7 - Checar velocidade");
      System.out.println("8 - Sair");
      System.out.print(": ");

      int comando = scanner.nextInt();

      switch (comando){
        case 1:
          carro.ligarCarro();
          break;
        case 2:
          carro.desligarCarro();
          break;
        case 3:
          carro.acelerarCarro();
          break;
        case 4:
          carro.desacelerarCarro();
          break;
        case 5:
          System.out.println("Digite o número da direção desejada: ");
          System.out.println("1 - Esquerda");
          System.out.println("2 - Direita");
          System.out.print(": ");
          int direcao = scanner.nextInt();
          if (direcao == 1){
            carro.virarCarro("esquerda");
          } else {
            carro.virarCarro("direita");
          }
          break;
        case 6:
          carro.frearCarro();
          break;
        case 7:
          System.out.println("Velocidade atual: " + carro.getVelocidade() + "km/h");
          break;
        case 8:
          System.out.println("Saindo...");
          return;
        default:
          System.out.println("Comando inválido");
      }

    }
  }
}
