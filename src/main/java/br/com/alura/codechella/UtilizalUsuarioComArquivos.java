package br.com.alura.codechella;

import java.time.LocalDate;

import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioEmArquivo;

public class UtilizalUsuarioComArquivos {
    public static void main(String[] args) {
        RepositorioDeUsuarioEmArquivo repositorioDeUsuarioEmArquivo = new RepositorioDeUsuarioEmArquivo();

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("000.000.000-00", "Teste", LocalDate.parse("2000-10-15"), "htas@hotmail.com"));
        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("000.000.000-00", "Teste1", LocalDate.parse("2000-10-15"), "htas@hotmail.com"));
        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("000.000.000-00", "Teste2", LocalDate.parse("2000-10-15"), "htas@hotmail.com"));
        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("000.000.000-00", "Teste3", LocalDate.parse("2000-10-15"), "htas@hotmail.com"));

        System.out.println(repositorioDeUsuarioEmArquivo.listarTodos());
    }
}
