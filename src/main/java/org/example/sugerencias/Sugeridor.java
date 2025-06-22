package org.example.sugerencias;

import org.example.Guardarropas;
import org.example.Vestimenta;
import org.example.prenda.Prenda;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Sugeridor {
  private final Guardarropas guardarropas;

  public Sugeridor(Guardarropas guardarropas) {
    this.guardarropas = guardarropas;
  }

  public Sugerencia getVestimentaRandom() {
    Vestimenta vestimenta = new Vestimenta(
        guardarropas.getPrendaSuperior(),
        guardarropas.getPrendaInferior(),
        guardarropas.getPrendaPies());

    return new Sugerencia((Set<Vestimenta>) Arrays.asList(vestimenta));
  }

  Sugerencia getAllCombinations(Predicate<Prenda> filtro) {
    filtro = filtro != null ? filtro : Prenda -> true;
    Set<Prenda> prendasSuperiores = filtrarSet(guardarropas.getPrendasSuperiores(), filtro);
    Set<Prenda> prendasInferiores = filtrarSet(guardarropas.getPrendasInferiores(), filtro);
    Set<Prenda> prendasPies = filtrarSet(guardarropas.getPrendasPies(), filtro);

    Set<Vestimenta> vestimentas = new HashSet<>();

    prendasSuperiores.forEach(
        psup -> prendasInferiores.forEach(
            pinf -> prendasPies.forEach(
                ppies -> vestimentas.add(new Vestimenta(psup, pinf, ppies))
            )
        )
    );

    return new Sugerencia(vestimentas);
  }

  Set<Prenda> filtrarSet(Set<Prenda> prendas, Predicate<Prenda> filtro) {
    return prendas.stream().filter(filtro).collect(Collectors.toSet());
  }

}
