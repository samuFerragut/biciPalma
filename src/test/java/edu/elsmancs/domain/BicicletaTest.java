package edu.elsmancs.domain;

import org.junit.Assert;
import org.junit.Test;

public class BicicletaTest {

    @Test
    public void comprobarIdBici() {
        Bicicleta bicicleta = new Bicicleta(234);
        Assert.assertEquals(234, 234);
    }
}
