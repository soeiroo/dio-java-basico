package edu.israel.segundasemana.poo.Escola;

import java.util.Scanner;

class Escola {
  static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o nome do aluno: ");
    String nome = scanner.nextLine();
    System.out.println("Digite a matricula do aluno: ");
    int matricula = scanner.nextInt();
    System.out.println("Digite a idade do aluno: ");
    int idade = scanner.nextInt();

    Aluno aluno = new Aluno(nome, matricula);
    aluno.setIdade(idade);

    System.out.println("Nome: " + aluno.getNome() + " Matrícula: " + aluno.getMatricula() + " Idade: " + aluno.getIdade());
  }
}
