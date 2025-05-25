package org.example.prenda;

import java.util.Objects;

public class Prenda {
  private TipoPrenda tipoPrenda;
  private Color color;
  private Color colorSecundario;
  private float temperaturaMaxima;

  public Color getColorSecundario() {
    return colorSecundario;
  }

  public Color getColor() {
    return color;
  }

  public TipoPrenda getTipoPrenda() {
    return tipoPrenda;
  }

  public Categoria getCategoria() {
    return tipoPrenda.getCategoria();
  }

  public TramaDeTela getTrama() {
    return tipoPrenda.getTrama();
  }

  public boolean esAptaParaTemperatura(float temperatura) {
    return temperatura <= temperaturaMaxima;
  }




  public void setTipoPrenda(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }
  public void setTrama(TramaDeTela trama) {
    this.tipoPrenda.setTrama(trama);
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void setColor(Color color) {
    this.color = color;
  }
}

