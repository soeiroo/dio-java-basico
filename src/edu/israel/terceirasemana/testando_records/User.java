package edu.israel.terceirasemana.testando_records;

import java.util.Scanner;

public class User {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    UserInfo userInfo = new UserInfo(name);
    System.out.println(userInfo.name());
  }
}
