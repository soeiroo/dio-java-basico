package edu.israel.segundasemana.poo.fundamentos.vehicles;

public class Moto extends Veiculo {
  private String modelo;

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  @Override
  public void ligar(){
    System.out.println("Moto ligada");
  }

  @Override
  public void desligar(){
    System.out.println("Moto desligada");
  }
}
