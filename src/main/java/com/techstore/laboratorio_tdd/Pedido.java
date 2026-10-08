package com.techstore.laboratorio_tdd;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private static final double PORCENTAJE_DESCUENTO = 0.10;
    private static final double UMBRAL_DESCUENTO = 100000;

    private final List<Producto> productos = new ArrayList<>();

    /**
     * Agrega un producto al pedido.
     *
     * @param producto producto a agregar
     */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Calcula el total del pedido sumando el precio de todos sus productos.
     *
     * @return total del pedido en colones, sin descuento
     */
    public double calcularTotal() {
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .sum();
    }

    /**
     * Calcula el total del pedido aplicando el descuento del 10%
     * cuando el total es mayor o igual a ₡100.000.
     *
     * @return total final en colones
     */
    public double calcularTotalConDescuento() {
        double total = calcularTotal();
        return aplicaDescuento(total) ? total - (total * PORCENTAJE_DESCUENTO) : total;
    }

    private boolean aplicaDescuento(double total) {
        return total >= UMBRAL_DESCUENTO;
    }
}