package edu.israel.primeirasemana.miniprojeto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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

  public List<Animal> loadFromJsonDB(String FILE_PATH){
    List<Animal> animals = new ArrayList<>();
    Gson gson = new Gson();

    try (FileReader reader = new FileReader(FILE_PATH)){
      animals = gson.fromJson(reader, new TypeToken<List<Animal>>(){}.getType());
    } catch (IOException e){
      e.printStackTrace();
    }
    return animals;
  }

  public void registerAnimal() {
    String FILE_PATH = "src/edu/israel/primeirasemana/miniprojeto/animals-info.json";
    List<Animal> animals = loadFromJsonDB(FILE_PATH);
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    Scanner reader = new Scanner(System.in);

    System.out.print("Digite o nome do animal: ");
    String name = reader.nextLine();
    System.out.print("Digite a espécie do animal: ");
    String species = reader.nextLine();
    System.out.print("Digite a idade do animal: ");

    int age;
    do {
      while (!reader.hasNextInt()) {
        System.out.print("Digite um número válido para a idade: ");
        reader.next();
      }
      age = reader.nextInt();
    } while (age <= 0);

    int id;
    Animal animal = animals.getLast();
    id = animal.getId() + 1;
    System.out.println(animal);

    animals.add(new Animal(name, species, age, id));
    try (FileWriter writer = new FileWriter(FILE_PATH)){
      gson.toJson(animals, writer);
    } catch (IOException e){
      e.printStackTrace();
    }

    System.out.println("Animal cadastrado com sucesso!");

  }

  public void listAnimals(){
  String FILE_PATH = "src/edu/israel/primeirasemana/miniprojeto/animals-info.json";
  List<Animal> animals = loadFromJsonDB(FILE_PATH);

  for (Animal animal : animals) {
    System.out.print("ID: " + animal.getId() + " | Nome: " + animal.getName() + "\n");
    System.out.println("----------------------");
  }
  }

}

