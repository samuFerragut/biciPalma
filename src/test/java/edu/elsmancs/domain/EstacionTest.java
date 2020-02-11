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
}
