package com.techstore.laboratorio_tdd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValidadorCorreoTest {

    @Test
    void deberiaAceptarCorreoValido() {
        // Arrange
        ValidadorCorreo validador = new ValidadorCorreo();
        String correo = "juan@gmail.com";

        // Act
        boolean resultado = validador.esValido(correo);

        // Assert
        assertTrue(resultado);
    }

    @ParameterizedTest
    @ValueSource(strings = {"juangmail.com", "juan@", "@gmail.com"})
    void deberiaRechazarCorreoInvalido(String correo) {
        // Arrange
        ValidadorCorreo validador = new ValidadorCorreo();

        // Act
        boolean resultado = validador.esValido(correo);

        // Assert
        assertFalse(resultado);
    }
}