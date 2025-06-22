package org.example.clima;

public enum Alerta {
    TORMENTA("Debes llevar paraguas"),
    GRANIZO("Evita salir en auto");

    private final String mensaje;

    private Alerta(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
