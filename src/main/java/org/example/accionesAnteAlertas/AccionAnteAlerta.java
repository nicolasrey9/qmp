package org.example.accionesAnteAlertas;

import org.example.clima.Alerta;
import org.example.usuario.Usuario;

import java.util.List;

public interface AccionAnteAlerta {
    public void reaccionarAnteAlerta(List<Alerta> alertas, Usuario usuario);
}
