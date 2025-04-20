package org.example;

import java.util.Objects;

public class BorradorPrenda {
  private final TipoPrenda tipoPrenda;
  private TramaDeTela trama;
  public Color color;
  public Color colorSecundario = null;

  public BorradorPrenda(TipoPrenda tipoPrenda) {
    this.tipoPrenda = Objects.requireNonNull(tipoPrenda);
  }

  public Prenda guardar() {
    if(! validar(this.tipoPrenda, this.trama, this.color)) throw new RuntimeException();
    return new Prenda(this.tipoPrenda, this.trama, this.color, this.colorSecundario);
  }

  private boolean validar(TipoPrenda tipoPrenda, TramaDeTela trama, Color color) {
    // TODO

    return true;
  }


  public Categoria getCategoria() {
    return tipoPrenda.getCategoria();
  }

  public TramaDeTela getTrama() {
    return tipoPrenda.getTrama();
  }



  public void setTrama(TramaDeTela trama) {
    tipoPrenda.setTrama(trama);
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }
}
