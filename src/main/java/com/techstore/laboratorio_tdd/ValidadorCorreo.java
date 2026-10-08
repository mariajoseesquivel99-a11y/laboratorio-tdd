package com.techstore.laboratorio_tdd;

public class ValidadorCorreo {

    public boolean esValido(String correo) {
        return correo.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }
}