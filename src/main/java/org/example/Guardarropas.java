package org.example;

import org.example.clima.ServicioDeObtencionDelClima;
import org.example.exceptions.SinEsaCategoriaException;
import org.example.prenda.Categoria;
import org.example.prenda.Prenda;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Guardarropas {
  private List<Prenda> prendas;
  private ServicioDeObtencionDelClima climaService;

  public Guardarropas(ServicioDeObtencionDelClima climaService) {
    this.prendas = new ArrayList<>();
    this.climaService = climaService;
  }

  public List<Prenda> prendasAptasAClima() {
    return this.prendas
        .stream()
        .filter(prenda -> prenda.esAptaParaTemperatura(climaService.getTemperatura()))
        .collect(Collectors.toList());
  }

  public void add(Prenda prenda) {
    prendas.add(prenda);
  }

  public Prenda getPrendaSuperior() {
    return this.prendasAptasAClima().stream().filter(
        p -> p.getCategoria() == Categoria.PARTE_SUPERIOR).
        findAny().orElseThrow(SinEsaCategoriaException::new);
  }

  public Prenda getPrendaInferior() {
    return this.prendasAptasAClima().stream().filter(
            p -> p.getCategoria() == Categoria.PARTE_INFERIOR).
        findAny().orElseThrow(SinEsaCategoriaException::new);
  }

  public Prenda getPrendaPies() {
    return this.prendasAptasAClima().stream().filter(
            p -> p.getCategoria() == Categoria.CALZADO).
        findAny().orElseThrow(SinEsaCategoriaException::new);
  }

  public Set<Prenda> getPrendasSuperiores() {
    return this.prendasAptasAClima().stream()
        .filter(p -> p.getCategoria() == Categoria.PARTE_SUPERIOR)
        .collect(Collectors.toSet());
  }

  public Set<Prenda> getPrendasInferiores() {
    return this.prendasAptasAClima().stream().filter(
        p -> p.getCategoria() == Categoria.PARTE_INFERIOR)
        .collect(Collectors.toSet());
  }

  public Set<Prenda> getPrendasPies() {
    return this.prendasAptasAClima().stream().filter(
        p -> p.getCategoria() == Categoria.CALZADO)
        .collect(Collectors.toSet());
  }




}
