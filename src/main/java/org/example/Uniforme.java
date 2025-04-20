package org.example;

public class Uniforme {
  public final Prenda prendaSuperior, prendaInferior, calzado;


  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    validarPrenda(prendaSuperior, Categoria.PARTE_SUPERIOR);
    validarPrenda(prendaInferior, Categoria.PARTE_INFERIOR);
    validarPrenda(calzado, Categoria.CALZADO);

    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
  }


  public static void validarPrenda(Prenda prenda, Categoria categoriaEsperada) {
    if (prenda == null) {
      throw new IllegalArgumentException("La prenda no puede ser null.");
    }

    if (!prenda.getCategoria().equals(categoriaEsperada)) {
      throw new IllegalArgumentException(
          "Se esperaba una prenda de categoría " + categoriaEsperada +
              " pero se recibió " + prenda.getCategoria()
      );
    }
  }

}
