package edu.israel.primeirasemana;

public class Operators {
  public static void main(String[] args) {


    //int numberX = 5;
    //int numberY = 6;

    //String resultado = numberY < numberX ? "Verdadeiro" : "Falso";
    //System.out.println(resultado);

    String name = "Pedro";
    String name2 = "PEDRO";
    String name3 = new String ("Pedro");

    if (name.equals(name3)) {
      System.out.println("São iguais");
    } else {
      System.out.println("São diferentes");
    }
  }
}