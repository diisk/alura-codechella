package br.com.alura.codechella.infra.gateways;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.codechella.application.gateways.RepositorioUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;

public class RepositorioDeUsuarioEmArquivo implements RepositorioUsuario {

    List<Usuario> usuarios = new ArrayList<>();

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
        return usuario;
    }

    @Override
    public List<Usuario> listarTodos() {
        return this.usuarios;
    }

}
