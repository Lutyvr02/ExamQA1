package ej1Test;

import ej1.Ej1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class Ej1Test {

    private Ej1 ej1;

    @BeforeAll
    public void setEj1(){ej1 = new Ej1();}


    @ParameterizedTest
    @CsvSource({
            "2000.0, 2000.0",
            "1000.0, 1000.0",
            "2000.0, 2000.0",
            "2000.0, 2000.0",
            "2000.0, 2000.0",
            "2000.0, 2000.0",

    })
    public void paratest(double n, double expec) throws Ej1.SalarioNoValidoException {
        double curr = ej1.verificarDescuento(n);
        Assertions.assertEquals(expec, curr, "Error en la prueba");
    }
}
