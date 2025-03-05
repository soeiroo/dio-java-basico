package edu.israel.primeirasemana.miniprojeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final String FILE_PATH = "animals-info.json";
    List<Animal> animals = new ArrayList<Animal>();
    //Ainda a ser implementado


    Scanner reader = new Scanner(System.in);

    while (true) {
      System.out.print("[1] Cadastrar um animal\n[2] Listar animais\n[3] Sair\n");
      int option = reader.nextInt();
      //AnimalRegistry registry = new AnimalRegistry();

      switch (option) {
        case 1: {

        }
        //case 1 -> registerAnimal();
        //case 2 -> listAnimals();}
      }
    }
  }
}
