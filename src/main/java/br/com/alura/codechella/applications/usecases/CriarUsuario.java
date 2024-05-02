package br.com.alura.codechella.applications.usecases;

import br.com.alura.codechella.applications.gateways.RepositorioUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;

public class CriarUsuario {

    private final RepositorioUsuario repositorio;

    public CriarUsuario(RepositorioUsuario repositorio){
        this.repositorio = repositorio;
    }

    public Usuario cadastrarUsuario(Usuario usuario){
        return repositorio.cadastrarUsuario(usuario);
    }

}
