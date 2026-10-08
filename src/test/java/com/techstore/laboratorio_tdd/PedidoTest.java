package com.techstore.laboratorio_tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PedidoTest {

    @Test
    void deberiaCalcularTotalConVariosProductos() {
        // Arrange
        Pedido pedido = new Pedido();
        pedido.agregarProducto(new Producto("Mouse", 10000));
        pedido.agregarProducto(new Producto("Teclado", 20000));

        // Act
        double total = pedido.calcularTotal();

        // Assert
        assertEquals(30000, total, 0.001);
    }

    @Test
    void deberiaRetornarCeroEnPedidoVacio() {
        // Arrange
        Pedido pedido = new Pedido();

        // Act
        double total = pedido.calcularTotal();

        // Assert
        assertEquals(0, total, 0.001);
    }

    @Test
    void deberiaAplicarDescuentoCuandoTotalSuperaElUmbral() {
        // Arrange
        Pedido pedido = new Pedido();
        pedido.agregarProducto(new Producto("Monitor", 120000));

        // Act
        double total = pedido.calcularTotalConDescuento();

        // Assert
        assertEquals(108000, total, 0.001);
    }
    @Test
    void deberiaNoAplicarDescuentoCuandoTotalEsMenorAlUmbral() {
        // Arrange
        Pedido pedido = new Pedido();
        pedido.agregarProducto(new Producto("Teclado", 50000));

        // Act
        double total = pedido.calcularTotalConDescuento();

        // Assert
        assertEquals(50000, total, 0.001);
    }
}