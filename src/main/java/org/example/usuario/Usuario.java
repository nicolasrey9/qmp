package org.example.usuario;

import org.example.accionesAnteAlertas.AccionAnteAlerta;
import org.example.Guardarropas;
import org.example.clima.Alerta;
import org.example.sugerencias.Sugerencia;
import org.example.sugerencias.Sugeridor;

import java.util.List;

public class Usuario {
    private Guardarropas guardarropas;
    private Sugeridor sugeridor;
    private Sugerencia sugerenciaDiaria;
    private List<AccionAnteAlerta> accionesAnteAlerta;
    private String mail;

    public String getMail() {
        return mail;
    }

    public void calcularSugerenciaDiaria(List<Alerta> alertas) {
        this.sugerenciaDiaria = sugeridor.getVestimentaRandom();
    }
    public Sugerencia getSugerenciaDiaria() {
        return this.sugerenciaDiaria;
    }

    public void reaccionarAnteAlerta(List<Alerta> alertas){
        accionesAnteAlerta.forEach(ac -> ac.reaccionarAnteAlerta(alertas, this));
    }

    public List<AccionAnteAlerta> getAccionesAnteAlerta() {
        return accionesAnteAlerta;
    }
    public void setAccionesAnteAlerta(List<AccionAnteAlerta> accionesAnteAlerta) {
        this.accionesAnteAlerta = accionesAnteAlerta;
    }
}
