package org.example.clima;

import java.util.List;

public interface ServicioDeObtencionDelClima {
  public float getTemperatura();
  public List<Alerta> getAlertas();
}
