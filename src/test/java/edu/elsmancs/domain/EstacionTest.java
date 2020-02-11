package edu.elsmancs.domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
import edu.elsmancs.domain.Estacion;

public class EstacionTest {
    @Test
    public void consultarEstacionTest() {
        Estacion estacion = new Estacion(1,"Manacor", 6);
        estacion.consultarEstacion();
    }

    @Test
    public void anclajesLibresTest() {
        Estacion estacion = new Estacion(2, "Palma", 7);

        estacion.consultarEstacion();
        estacion.anclajesLibres();
    }
}
