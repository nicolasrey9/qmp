package org.example.accionesAnteAlertas;

import org.example.aux.MailSender;
import org.example.clima.Alerta;
import org.example.usuario.Usuario;

import java.util.List;

public class EnviarMail implements AccionAnteAlerta {
    private MailSender mailSender;

    public EnviarMail(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void reaccionarAnteAlerta(List<Alerta> alertas, Usuario usuario) {
        StringBuilder mensaje = new StringBuilder();
        for (Alerta alerta : alertas) {
            mensaje.append(alerta.toString());
            mensaje.append("\n");
        }

        mailSender.send(usuario.getMail(), mensaje.toString());
    }
}
