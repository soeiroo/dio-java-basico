package edu.israel.primeirasemana;

public class SmartTv {
  private boolean ligada = false;
  private int volume = 25;
  private int canal = 1;

  public void ligar() {
    this.ligada = true;
    System.out.println("TV ligada");
  }

  public void desligar() {
    this.ligada = false;
    System.out.println("TV desligada");
  }

  public void aumentarVolume(){
    if ( this.ligada == true){
      this.volume++;
      System.out.println("Volume aumentado para: " + this.volume);
    } else {
      System.out.println("TV desligada, ligue para aumentar o volume");
    }
  }

  public void diminuirVolume(){
    if ( this.ligada == true){
      this.volume--;
      System.out.println("Volume diminuído para: " + this.volume);
    } else {
      System.out.println("TV desligada, ligue para diminuir o volume");
    }
  }

  public void status() {
    System.out.println("TV ligada: " + this.ligada);
    System.out.println("Volume: " + this.volume);
    System.out.println("Canal: " + this.canal);
  }
}