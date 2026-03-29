package org.example;

import java.time.LocalDate;

public class Cita {

    public String validar(String codigo, String nombre, String dni, String fecha) {

        if (codigo.isEmpty() || nombre.isEmpty() || dni.isEmpty() || fecha.isEmpty()) {
            return "Debe ingresar todos los datos requeridos";
        }

        if (!codigo.matches("C\\d{3}")) {
            return "Ingrese un código de cita válido";
        }

        if (!nombre.matches("[a-zA-Z]{5,}")) {
            return "El nombre del paciente debe tener al menos cinco caracteres alfabéticos";
        }



        LocalDate fechaCita = LocalDate.parse(fecha);
        if (!fechaCita.isAfter(LocalDate.now())) {
        return "La fecha de la cita debe ser posterior a la fecha actual";
        }

        return "La cita ha sido registrada correctamente";
    }
}
