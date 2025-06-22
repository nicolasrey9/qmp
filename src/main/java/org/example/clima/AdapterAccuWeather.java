package org.example.clima;

import org.example.api.AccuWeatherAPI;
import java.util.List;
import java.util.Map;

public class AdapterAccuWeather implements ServicioDeObtencionDelClima {
  private final AccuWeatherAPI api = new AccuWeatherAPI();

  @Override
  public List<Alerta> getAlertas() {
    return List.of();
  }

  @Override
  public float getTemperatura() {
    List<Map<String, Object>> weatherList = api.getWeather("Villa Vil");

    Map<String, Object> weatherData = weatherList.get(0);

    @SuppressWarnings("unchecked")
    Map<String, Object> temperatureData = (Map<String, Object>) weatherData.get("Temperature");

    float temperatureValue = (float) temperatureData.get("Value");

    return this.farenheitToCelcius(temperatureValue);
  }

  private float farenheitToCelcius(float f) {
    return (f - 32) * 5 / 9;
  }

}
