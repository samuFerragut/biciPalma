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
        Assert.assertEquals(estacion.getNumeroAnclajes(), 6,0);
    }

    @Test
    public void anclajesLibresTest() {
        Estacion estacion = new Estacion(2, "Palma", 7);

       Assert.assertEquals(estacion.anclajesLibres(), 7, 0);
    }

    @Test
    public void anclarBicicletaTest() {
        Estacion estacion = new Estacion(1, "Manacor", 6);

        int[] bicicletas = {291, 292, 293, 294};
        Bicicleta[] anclajes;

        int posicionAnclaje = 0;

        anclajes = new Bicicleta[6];

        for (int id : bicicletas) {
            Bicicleta bicicleta = new Bicicleta(id);
            estacion.anclarBicicleta(bicicleta);
            anclajes[posicionAnclaje] = bicicleta;
            posicionAnclaje ++;
        }
        Assert.assertArrayEquals(anclajes, estacion.anclarBicicleta());
    }
}
