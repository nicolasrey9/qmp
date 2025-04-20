package org.example;

public class Color {
  private final int rojo, verde, azul;

  public Color(int rojo, int verde, int azul) {
    this.rojo = rojo;
    this.verde = verde;
    this.azul = azul;
  }

  // Opcional: getters
  public int getRojo() {
    return rojo;
  }

  public int getVerde() {
    return verde;
  }

  public int getAzul() {
    return azul;
  }
}

