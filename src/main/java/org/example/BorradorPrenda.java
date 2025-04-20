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
    validar(this.tipoPrenda, this.trama, this.color);
    Prenda prenda = new Prenda();
    prenda.setTipoPrenda(this.tipoPrenda);
    prenda.setColor(this.color);
    prenda.setColorSecundario(this.colorSecundario);
    return prenda;
  }

  private void validar(TipoPrenda tipoPrenda, TramaDeTela trama, Color color) {
    if(tipoPrenda == null || trama == null || color == null) {
      throw new BorradorNoAptoException("Falta definir alguno de los atributos escenciales");
    }
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
