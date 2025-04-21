package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Uniforme {
  private List<Prenda> prendas = new ArrayList<>();

  public Uniforme(Prenda ... prendas) {
    validarPrendas(prendas);
    this.prendas = List.of(prendas);
  }

  private static void validarPrendas(Prenda ... prendas) {
    if(!hayPrendaCategoria(Categoria.PARTE_SUPERIOR, prendas) || !hayPrendaCategoria(Categoria.PARTE_INFERIOR, prendas)
    || !hayPrendaCategoria(Categoria.CALZADO, prendas)) throw new IllegalArgumentException("Falta definir alguno de los atributos escenciales del uniforme");

    if (Arrays.asList(prendas).contains(null)) {
      throw new IllegalArgumentException("No se permiten prendas nulas");
    }
  }

  private static boolean hayPrendaCategoria(Categoria categoria, Prenda ... prendas) {
    return Arrays.stream(prendas).anyMatch(prenda -> prenda.getCategoria() == categoria);
  }
}
