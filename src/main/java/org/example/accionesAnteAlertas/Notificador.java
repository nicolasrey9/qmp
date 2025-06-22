package org.example.accionesAnteAlertas;

import org.example.aux.NotificationService;
import org.example.clima.Alerta;
import org.example.usuario.Usuario;

import java.util.List;

public class Notificador implements AccionAnteAlerta {
    private NotificationService notificationService;

    public Notificador(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void reaccionarAnteAlerta(List<Alerta> alertas, Usuario usuario) {
        alertas.forEach(alerta -> notificationService.notify(alerta.getMensaje()));
    }
}
