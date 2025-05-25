package org.example;

import org.example.prenda.Prenda;

public class Vestimenta {
  private final Prenda prendaSuperior;
  private final Prenda prendaInferior;
  private final Prenda prendaPies;

  public Vestimenta(Prenda prendaSuperior, Prenda prendaInferior, Prenda prendaPies) {
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.prendaPies = prendaPies;
  }

  public Prenda getPrendaSuperior() {
    return prendaSuperior;
  }

  public Prenda getPrendaInferior() {
    return prendaInferior;
  }

  public Prenda getPrendaPies() {
    return prendaPies;
  }
}
