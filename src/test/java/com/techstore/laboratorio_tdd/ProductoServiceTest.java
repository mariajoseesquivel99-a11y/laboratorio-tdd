package com.techstore.laboratorio_tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ProductoServiceTest {

    @Test
    void deberiaRegistrarProductoValido() {
        // Arrange
        ProductoService servicio = new ProductoService();
        String nombre = "Mouse";
        double precio = 10000;

        // Act
        Producto producto = servicio.registrar(nombre, precio);

        // Assert
        assertNotNull(producto);
        assertEquals("Mouse", producto.getNombre());
        assertEquals(10000, producto.getPrecio(), 0.001);
    }

    @Test
    void deberiaRechazarPrecioNegativo() {
        // Arrange
        ProductoService servicio = new ProductoService();
        String nombre = "Mouse";
        double precio = -5000;

        // Act + Assert
        assertThrows(IllegalArgumentException.class,
                () -> servicio.registrar(nombre, precio));
    }
}