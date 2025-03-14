package edu.israel.segundasemana.poo.Escola;

class Aluno {
  private String nome;
  private int matricula;
  private int idade;

  Aluno(String nome, int matricula){
    this.nome = nome;
    this.matricula = matricula;
  }

  String getNome(){
    return nome;
  }

  int getMatricula(){
    return matricula;
  }

  int getIdade(){
    return idade;
  }
  void setIdade(int idade){
    this.idade = idade;
  }
}
