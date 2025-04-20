package org.example;

public enum TipoPrenda {
  ZAPATOS(Categoria.CALZADO),
  CAMISADEMANGASCORTAS(Categoria.PARTE_SUPERIOR),
  PANTALON(Categoria.PARTE_INFERIOR),
  SHORT(Categoria.PARTE_INFERIOR),
  CAMISADEMANGASLARGAS(Categoria.PARTE_SUPERIOR),
  REMERA(Categoria.PARTE_SUPERIOR),
  BUZO(Categoria.PARTE_SUPERIOR);


  private final Categoria categoria;
  private TramaDeTela trama = TramaDeTela.LISA;

  TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public TramaDeTela getTrama() {
    return trama;
  }

  public void setTrama(TramaDeTela trama) {
    if(!this.esConsistenteCon(trama)) throw new IllegalArgumentException("trama inconsistente con el tipo de prenda");
    this.trama = trama;
  }

  private boolean esConsistenteCon(TramaDeTela trama) {
    return true;
  }
}

