package edu.israel.terceirasemana.herança_polimorfismo;

public class Vendedor extends Funcionario{
  public Vendedor(String nome, String email, String senha) {
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.admin = false;
  }

  public String realizarVenda(){
    return "Venda realizada";
  }

  public String consultarVendas(){
    return "Vendas consultadas";
  }

}
