package org.example.clima;

import org.example.usuario.RepositorioUsuarios;
import org.example.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class AlertadorMeteorologico {
    private ServicioDeObtencionDelClima servicio;
    private List<Alerta> alertas;
    private RepositorioUsuarios repositorioUsuarios;

    public AlertadorMeteorologico(ServicioDeObtencionDelClima servicio,
                                  RepositorioUsuarios repositorioUsuarios) {
        this.servicio = servicio;
        alertas = new ArrayList<>();
        this.repositorioUsuarios = repositorioUsuarios;
    }

    public void dispararAlertas() {
        this.alertas = servicio.getAlertas();
        repositorioUsuarios.getUsers().forEach(usuario -> usuario.reaccionarAnteAlerta(alertas));
    }

    public List<Alerta> getAlertas() {
        return alertas;
    }
}
