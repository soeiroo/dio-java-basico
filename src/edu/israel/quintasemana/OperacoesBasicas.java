package edu.israel.quintasemana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperacoesBasicas {
  private List<String> tarefas = new ArrayList<>();

  void adicionarTarefa(String descricao){
    tarefas.add(descricao);
  }

  void removerTarefa(String descricao){
    tarefas.remove(descricao);
  }

  void obterNumeroTotalTarefas(){
    System.out.println("Número total de tarefas: " + tarefas.size());
  }

  void obterDescricoesTarefas(){
    System.out.println("Tarefas: " + Arrays.toString(tarefas.toArray()));

  }

  public static void main(String[] args) {
    OperacoesBasicas operacoes = new OperacoesBasicas();
    operacoes.adicionarTarefa("Estudar Java");
    operacoes.adicionarTarefa("Estudar Python");
    operacoes.adicionarTarefa("Estudar Rust");
    operacoes.adicionarTarefa("Estudar na Dio");
    operacoes.adicionarTarefa("Fazer exercícios");
    operacoes.removerTarefa("Estudar Java");
    operacoes.obterNumeroTotalTarefas();
    operacoes.obterDescricoesTarefas();
  }
}
