package edu.israel.terceirasemana;

public class Carro {
  private boolean status;
  private int velocidade;

  public void ligarCarro() {
    if (status){
      System.out.println("Carro já está ligado");
      return;
    } else {
      System.out.println("Carro ligado");
      this.status = true;
      velocidade = 0;
    }
  }

  public void desligarCarro() {
    if (status && velocidade == 0) {
      System.out.println("Carro desligado");
      this.status = false;
      return;
    } else if(status){
      System.out.println("Carro em movimento. Impossível desligar.");
      return;
    } else{
      System.out.println("Carro já está desligado.");
    }
  }

  public void frearCarro(){
    if (status && velocidade > 0){
      System.out.println("Freando o carro");
      velocidade = 0;
    } else {
      System.out.println("Carro desligado. Impossível frear.");
    }
  }

  public void acelerarCarro() {
    if (this.status) {
      if (velocidade == 120){
        System.out.println("Velocidade máxima atingida. Impossível acelerar.");
        return;
      }
      velocidade += 1;
      System.out.println("Acelerando o carro. Velocidade: " + velocidade + "km/h");
    } else {
      System.out.println("Carro desligado. Impossível acelerar.");
    }
  }

  public void desacelerarCarro(){
    if(status){
      if (velocidade == 0){
        System.out.println("Carro parado. Impossível desacelerar.");
        return;
      }

      velocidade -= 1;
      System.out.println("Desacelerando o carro. Velocidade: " + velocidade + "km/h");
    } else {
      System.out.println("Carro desligado. Impossível desacelerar.");
    }
  }

  public void virarCarro(String direcao){
    if(status && velocidade > 0 && velocidade <= 40){
      System.out.println("Virando o carro para a " + direcao);
    } else {
      System.out.println("Carro desligado. Impossível virar.");
    }
  }

  public void checarVelocidade(){
    if(status){
      System.out.println("Velocidade atual: " + velocidade + "km/h");
    } else {
      System.out.println("Carro desligado. Impossível checar velocidade.");
    }
  }

  public void trocarMarcha(){
    if (status){
      if (velocidade == 0){
        System.out.println("Carro parado. Marcha neutra.");
      } else if (velocidade > 0 && velocidade <= 20){
        System.out.println("Marcha 1");
      } else if (velocidade > 20 && velocidade <= 40){
        System.out.println("Marcha 2");
      } else if (velocidade > 40 && velocidade <= 60){
        System.out.println("Marcha 3");
      } else if (velocidade > 60 && velocidade <= 80){
        System.out.println("Marcha 4");
      } else if (velocidade > 80 && velocidade <= 100){
        System.out.println("Marcha 5");
      } else if (velocidade > 100 && velocidade <= 120){
        System.out.println("Marcha 6");
      }
    } else {
      System.out.println("Carro desligado. Impossível trocar marcha.");
    }
  }

  public int getVelocidade(){
    return this.velocidade;
  }
}
