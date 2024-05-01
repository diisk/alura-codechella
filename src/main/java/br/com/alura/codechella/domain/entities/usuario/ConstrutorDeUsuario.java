package br.com.alura.codechella.domain.entities.usuario;

import java.time.LocalDate;

import br.com.alura.codechella.domain.Endereco;

public class ConstrutorDeUsuario {


    private Usuario usuario;

    public Usuario comNomeCpfNascime(String nome, String cpf, LocalDate nascimento){
        this.usuario = new Usuario(cpf, nome, nascimento, null);
        return this.usuario;
    }

    public Usuario incluiEndereco(String cep, Integer numero, String complemento){
        this.usuario.setEndereco(new Endereco(cep,numero,complemento));
        return this.usuario;
    }
}
