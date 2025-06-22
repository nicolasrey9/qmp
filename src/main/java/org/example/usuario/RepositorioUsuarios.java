package org.example.usuario;

import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuarios {
    private List<Usuario> usuarios;
    
    public RepositorioUsuarios() {
        usuarios = new ArrayList<>();
    }
    
    public List<Usuario> getUsers() {
        return usuarios;
    }
}
