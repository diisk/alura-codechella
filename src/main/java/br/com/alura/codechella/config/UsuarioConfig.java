package br.com.alura.codechella.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.alura.codechella.application.gateways.RepositorioUsuario;
import br.com.alura.codechella.application.usecases.CriarUsuario;
import br.com.alura.codechella.application.usecases.ListarUsuarios;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioJpa;
import br.com.alura.codechella.infra.gateways.UsuarioEntityMapper;
import br.com.alura.codechella.infra.persistence.UsuarioRepository;

@Configuration
public class UsuarioConfig {

    @Bean
    CriarUsuario CriarUsuario(RepositorioUsuario repositorioUsuario) {
        return new CriarUsuario(repositorioUsuario);
    }

    @Bean
    ListarUsuarios ListarUsuarios(RepositorioUsuario repositorioUsuario) {
        return new ListarUsuarios(repositorioUsuario);
    }

    @Bean
    RepositorioDeUsuarioJpa criarRepositorioDeUsuarioJpa(UsuarioRepository repositorio, UsuarioEntityMapper mapper) {
        return new RepositorioDeUsuarioJpa(repositorio, mapper);
    }

    @Bean
    UsuarioEntityMapper retornaMapper() {
        return new UsuarioEntityMapper();
    }

}
