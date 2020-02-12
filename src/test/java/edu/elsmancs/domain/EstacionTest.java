package edu.elsmancs.domain;

import org.junit.Assert;
import org.junit.Test;

import edu.elsmancs.domain.Estacion;

public class EstacionTest {

    @Test
    public void crearEstacion() {
        Estacion estacion = new Estacion(1,"Manacor", 6);
        Assert.assertEquals(estacion.getId(), 1, 0);
        Assert.assertEquals(estacion.getDireccion(),"Manacor");
        Assert.assertEquals(estacion.getNumeroAnclajes(),6);
    }

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
