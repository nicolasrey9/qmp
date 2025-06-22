package org.example.accionesAnteAlertas;

import org.example.clima.Alerta;
import org.example.usuario.Usuario;

import java.util.List;

public class ActualizadorSugerencia implements AccionAnteAlerta {
    public void reaccionarAnteAlerta(List<Alerta> alertas, Usuario usuario) {
        usuario.calcularSugerenciaDiaria(alertas);
    }
}
