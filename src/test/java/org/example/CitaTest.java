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

    //Mi segundo Test and segundo push
    @Test
    public void testCodigoInvalido() {
        Cita cita = new Cita();
        String resultado = cita.validar("1234", "Carlos", "12345678", "2026-12-01");
        assertEquals("Ingrese un código de cita válido", resultado);
    }

    //Mi Tercer Test
    @Test
    public void testNombreInvalido() {
        Cita cita = new Cita();
        String resultado = cita.validar("C123", "Ana", "12345678", "2026-12-01");
        assertEquals("El nombre del paciente debe tener al menos cinco caracteres alfabéticos", resultado);
    }

    //Mi cuarto Test
    @Test
    public void testDniInvalido() {
        Cita cita = new Cita();
        String resultado = cita.validar("C123", "Carlos", "1234", "2026-12-01");
        assertEquals("Ingrese un número de documento válido", resultado);
    }

    //MI Quinto Test
    @Test
    public void testFechaInvalida() {
        Cita cita = new Cita();
        String resultado = cita.validar("C123", "Carlos", "12345678", "2020-01-01");
        assertEquals("La fecha de la cita debe ser posterior a la fecha actual", resultado);
    }

    //Mi sexto Test
    @Test
    public void testCamposVacios() {
        Cita cita = new Cita();
        String resultado = cita.validar("", "", "", "");
        assertEquals("Debe ingresar todos los datos requeridos", resultado);
    }
}
