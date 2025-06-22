package org.example.sugerencias;

import org.example.usuario.RepositorioUsuarios;
import org.example.usuario.Usuario;

public class DisparadorSugerencias {
    private RepositorioUsuarios usuariosRepo;

    public DisparadorSugerencias(RepositorioUsuarios usuariosRepo) {
        this.usuariosRepo = usuariosRepo;
    }
    public void dispararSugerenciasDiarias() {
        usuariosRepo.getUsers().forEach(Usuario::calcularSugerenciaDiaria);
    }
}
