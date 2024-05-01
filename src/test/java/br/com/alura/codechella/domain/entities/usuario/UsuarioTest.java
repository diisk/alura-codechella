package br.com.alura.codechella.domain.entities.usuario;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    public void naoDeveCadastrarUsuarioComCpfForaDoPadrao() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Usuario(null, null, null, null));
    }

    @Test
    public void deveCriarUsuariousandoFabricaDeUsuario() {
        ConstrutorDeUsuario builder = new ConstrutorDeUsuario();
        Usuario usuario = builder.comNomeCpfNascime("null", "000.000.000-00", LocalDate.parse("2000-10-01"));

        Assertions.assertEquals("null", usuario.getNome());

        usuario = builder.incluiEndereco("null", 54, "null");

        Assertions.assertEquals("null", usuario.getEndereco().getComplemento());

    }

}
