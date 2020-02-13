package edu.elsmancs.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class TarjetaUsuarioTest {

    @Test
    public void crearTarjetaUsuario() {
        TarjetaUsuario tarjeta = new TarjetaUsuario("123456789", true);
        assertEquals(tarjeta.getId(), "123456789");
        assertEquals(tarjeta.getActiva(), true);
    }

    @Test
    public void crearTarjetaUsuarioMayorNueve() {
        TarjetaUsuario tarjeta = new TarjetaUsuario("1234567891", false);
        assertEquals(tarjeta.getTamaño(), false);
    }

    @Test
    public void crearTarjetaUsuarioMenorNueve() {
        TarjetaUsuario tarjeta = new TarjetaUsuario("12345678", false);
        assertEquals(tarjeta.getTamaño(), false);
    }
}
