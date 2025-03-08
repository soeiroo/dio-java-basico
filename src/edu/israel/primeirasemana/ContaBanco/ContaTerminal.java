package edu.israel.primeirasemana.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = 0; double balance = 0; String clientName = ""; String agency = "";

    System.out.print("Digite o número da conta: ");
    number = scanner.nextInt();

    System.out.print("Digite o nome do cliente: ");
    clientName = scanner.next();

    System.out.print("Digite a agência da conta: ");
    agency = scanner.next();

    System.out.print("Digite o saldo da conta: ");
    balance = scanner.nextDouble();

    System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque");

  }
}
