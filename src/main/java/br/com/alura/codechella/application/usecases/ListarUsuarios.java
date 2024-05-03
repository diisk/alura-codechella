package br.com.alura.codechella.application.usecases;

import java.util.List;

import br.com.alura.codechella.application.gateways.RepositorioUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;

public class ListarUsuarios {

    private final RepositorioUsuario repositorio;

    public ListarUsuarios(RepositorioUsuario repositorio){
        this.repositorio = repositorio;

    }

    public List<Usuario> obterTodosUsuarios(){
        return this.repositorio.listarTodos();
    }

}
