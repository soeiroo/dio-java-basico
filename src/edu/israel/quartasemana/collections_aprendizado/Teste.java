package edu.israel.quartasemana.collections_aprendizado;

import java.util.*;

public class Teste {

  public static void main(String[] args) {
    Map<UUID, String> lista = new HashMap<>();

    List<Integer> listaInteiros = new ArrayList<>();

    listaInteiros.add(23);
    listaInteiros.add(233);
    listaInteiros.add(231);
    listaInteiros.add(143);
    listaInteiros.add(235);
    listaInteiros.add(231);
    listaInteiros.add(643);
    listaInteiros.add(24);

    Collections.sort(listaInteiros);
    System.out.println(listaInteiros);


    lista.put(UUID.randomUUID(), "Pedro Israel Gomes Soeiro");

    for (Map.Entry<UUID, String> entry : lista.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }
  }
}
