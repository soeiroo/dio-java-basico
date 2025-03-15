package edu.israel.segundasemana.poo.fundamentos.exemplo_interfaces;

public class Multifuncional implements Digitalizadora, Impressora {
  @Override
  public void digitalizar() {
    System.out.println("Digitalizando documento");
  }

  @Override
  public void imprimir() {
    System.out.println("Imprimindo documento");
  }
}
