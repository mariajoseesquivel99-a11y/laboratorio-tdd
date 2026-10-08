package com.techstore.laboratorio_tdd;

public class Cliente {

    private final String nombre;
    private final String correo;

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
}
