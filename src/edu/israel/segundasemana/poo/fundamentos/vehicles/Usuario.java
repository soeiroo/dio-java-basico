package edu.israel.segundasemana.poo.fundamentos.vehicles;

public class Usuario {
  public static void main(String[] args) {
    Carro carro = new Carro();
    carro.setChassi("425251");
    //carro.ligar();

    Moto moto = new Moto();
    moto.setChassi("4252151");
    //moto.ligar();

    Veiculo veiculo = new Moto();
    veiculo.ligar();

  }

}
