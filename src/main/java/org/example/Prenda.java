package org.example;

public class Prenda {
  private final TipoPrenda tipoPrenda;
  private TramaDeTela trama;
  public Color color;
  public Color colorSecundario;

  public Prenda(TipoPrenda tipoPrenda, TramaDeTela trama,
                Color color, Color colorSecundario) {
    this.tipoPrenda = tipoPrenda;
    tipoPrenda.setTrama(trama);
    this.color = color;
    this.colorSecundario = colorSecundario;
  }

  public Prenda(TipoPrenda tipoPrenda, TramaDeTela trama,
                Color color) {
    this(tipoPrenda, trama, color, null);
  }


  public Categoria getCategoria() {
    return tipoPrenda.getCategoria();
  }

  public TramaDeTela getTrama() {
    return tipoPrenda.getTrama();
  }

}

