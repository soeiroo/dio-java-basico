package edu.israel.segundasemana.poo.aprendendo_enums;

public class SistemaIbge {
  public static void main(String[] args) {
    for (EstadosBrasileiro estado : EstadosBrasileiro.values()) {
      System.out.println("Nome: " + estado.getNome() + " - Sigla: " + estado.getSigla());
    }
    System.out.println("----------------------");
    EstadosBrasileiro clientState = EstadosBrasileiro.CEARA;
    System.out.println(clientState.getNomeMaiusculo());
  }
}
