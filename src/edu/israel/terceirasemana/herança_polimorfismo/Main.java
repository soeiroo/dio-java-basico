package edu.israel.terceirasemana.herança_polimorfismo;

public class Main {
  public static void main(String[] args) {
    Funcionario vendedor = new Vendedor("Vendedor", "", "");
    Funcionario atendente = new Atendente("Atendente", "", "");
    Gerente gerente = new Gerente("Gerente", "", "");

    System.out.println(atendente.getAdmin());
    System.out.println(vendedor.getAdmin());
    System.out.println(gerente.getAdmin());

  }

}
