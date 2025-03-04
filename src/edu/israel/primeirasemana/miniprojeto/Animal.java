package edu.israel.primeirasemana.miniprojeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animal {
  private String name;
  private String species;
  private int age;
  private int id;


  //Construtor
  public Animal(String name, String species, int age, int id){
    this.name = name;
    this.species = species;
    this.age = age;
    this.id = id;
  }

  //Getters
  public String getName(){
    return this.name;
  }

  public String getSpecies(){
    return this.species;
  }

  public int getAge(){
    return this.age;
  }

  public int getId(){
    return this.id;
  }

  //Setters
  public void setName(String name) { this.name = name; }

  public void setSpecies(String species){
    this.species = species;
  }

  public void setAge(int age){
    this.age = age;
  }

  public void setId(int id){
    this.id = id;
  }

  public static void main(String[] args) {
    final String FILE_PATH = "animals-info.json";
    List<Animal> animals = new ArrayList<Animal>();
    System.out.println(animals);

    Scanner reader = new Scanner(System.in);

    while (true){
      System.out.print("[1] Cadastrar um animal\n[2] Listar animais\n[3] Sair\n");
      int option = reader.nextInt();

      switch (option) {
        case 1 -> cadastrarAnimal();

        //case 2 -> listarAnimais();}

    }
  }


  private static void cadastrarAnimal() {
    Scanner reader = new Scanner(System.in);
    System.out.print("Digite o nome do animal: ");
    String name = reader.nextLine();
    System.out.print("Digite a espécie do animal: ");
    String species = reader.nextLine();
    System.out.print("Digite a idade do animal: ");
    int age = reader.nextInt();
  }

}
