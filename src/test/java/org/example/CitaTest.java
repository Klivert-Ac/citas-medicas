package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

  //Mi primer push
public class CitaTest {
    @Test
    public void testCodigoValido() {
        Cita cita = new Cita();
        String resultado = cita.validar("C123", "Carlos", "12345678", "2026-12-01");
        assertEquals("La cita ha sido registrada correctamente", resultado);
    }
}
