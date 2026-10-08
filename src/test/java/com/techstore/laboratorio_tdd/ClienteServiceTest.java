package com.techstore.laboratorio_tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ClienteServiceTest {

    @Test
    void deberiaRegistrarClienteValido() {
        // Arrange
        ClienteService servicio = new ClienteService();
        String nombre = "Juan Pérez";
        String correo = "juan@gmail.com";

        // Act
        Cliente cliente = servicio.registrar(nombre, correo);

        // Assert
        assertNotNull(cliente);
        assertEquals("Juan Pérez", cliente.getNombre());
        assertEquals("juan@gmail.com", cliente.getCorreo());
    }

    @Test
    void deberiaRechazarClienteSinNombre() {
        // Arrange
        ClienteService servicio = new ClienteService();
        String nombre = "";
        String correo = "juan@gmail.com";

        // Act + Assert
        assertThrows(IllegalArgumentException.class,
                () -> servicio.registrar(nombre, correo));
    }
}