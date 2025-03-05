package edu.israel.primeirasemana.miniprojeto;

import java.util.Scanner;

public class Animal {
  private String name;
  private String species;
  private int age;
  private int id;


  //Constructor
  public Animal(String name, String species, int age, int id) {
    this.name = name;
    this.species = species;
    this.age = age;
    this.id = id;
  }

  //Getters
  public String getName() {
    return this.name;
  }

  public String getSpecies() {
    return this.species;
  }

  public int getAge() {
    return this.age;
  }

  public int getId() {
    return this.id;
  }

  //Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setId(int id) {
    this.id = id;
  }
}

class AnimalRegistry{
  private void registerAnimal() {
    Scanner reader = new Scanner(System.in);
    System.out.print("Digite o nome do animal: ");
    String name = reader.nextLine();
    System.out.print("Digite a espécie do animal: ");
    String species = reader.nextLine();
    System.out.print("Digite a idade do animal: ");
    int age;
    do {
      System.out.println("Digite a idade do animal (número positivo): ");
      while (!reader.hasNextInt()) {
        System.out.print("Digite um número válido para a idade: ");
        reader.next();
      }
      age = reader.nextInt();
    } while (age <= 0);


    System.out.println("Animal cadastrado com sucesso!");

  }

}


