package edu.israel.primeirasemana;

import java.util.Scanner;

import static java.lang.System.out;

public class Strings {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    String name = reader.next();
    String lastName = reader.next();

    out.println(entireName(name, lastName));
  }

  public static String entireName(String name, String lastName) {
    return name + " " + lastName;
  }
}
