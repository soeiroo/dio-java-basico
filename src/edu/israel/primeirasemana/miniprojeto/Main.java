package edu.israel.primeirasemana.miniprojeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <h1>Classe principal do programa</h1>
 * <p>Esse programa tem como funções o incremento e listar de animais</p>
 *
 * @author Israel Soeiro
 * @version 1.0.0
 * @since 05/03/2025
 */

public class Main {

  public static int screenWaiting() {

    Scanner reader = new Scanner(System.in);
    String response = "";
    while ( !response.equalsIgnoreCase("Y")) {
      System.out.println("Deseja voltar ao menu principal? [Y/N]: ");
      response = reader.next();
    }
    return 0;
  }



  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);

    while (true) {
      System.out.print("[1] Cadastrar um animal\n[2] Listar animais\n[3] Teste\n[4] Sair\n");
      int option = reader.nextInt();
      AnimalRegistry registry = new AnimalRegistry();

      switch (option) {
        case 1: {
          registry.registerAnimal();
          screenWaiting();
          break;
        }
        case 2: {
          registry.listAnimals();
          screenWaiting();
          break;
        }
        //case 3 -> teste();
      }
    }
  }
}
