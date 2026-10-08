package com.techstore.laboratorio_tdd;

public class ProductoService {

    private static final String MENSAJE_PRECIO_NEGATIVO = "El precio no puede ser negativo";

    /**
     * Registra un producto con su nombre y precio.
     *
     * @param nombre nombre del producto
     * @param precio precio del producto en colones (no puede ser negativo)
     * @return el producto registrado
     * @throws IllegalArgumentException si el precio es negativo
     */
    public Producto registrar(String nombre, double precio) {
        validarPrecio(precio);
        return new Producto(nombre, precio);
    }

    private void validarPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException(MENSAJE_PRECIO_NEGATIVO);
        }
    }
}