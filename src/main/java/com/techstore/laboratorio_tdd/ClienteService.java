package com.techstore.laboratorio_tdd;

public class ClienteService {

    private static final String MENSAJE_NOMBRE_OBLIGATORIO = "El nombre es obligatorio";

    /**
     * Registra un cliente con su nombre completo y correo electrónico.
     *
     * @param nombre nombre completo del cliente (obligatorio)
     * @param correo correo electrónico del cliente
     * @return el cliente registrado
     * @throws IllegalArgumentException si el nombre es nulo o está vacío
     */
    public Cliente registrar(String nombre, String correo) {
        validarNombre(nombre);
        return new Cliente(nombre, correo);
    }

    private void validarNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException(MENSAJE_NOMBRE_OBLIGATORIO);
        }
    }
}