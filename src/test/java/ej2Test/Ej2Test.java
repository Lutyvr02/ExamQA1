package ej2Test;

import ej2.Ej2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;
import ej2.reservaVuelo;

public class Ej2Test {
    private static Ej2 ej2;

    private static reservaVuelo res;

    @BeforeAll
    public static void setEj2(){
        res = Mockito.mock(reservaVuelo.class);
        ej2 = new Ej2();
        ej2.setRes(res);
    }

    @ParameterizedTest
    @CsvSource({
            "La Paz, 2, 5, 29, 2023",
    })
    public void testej2(String destino, int cantidad,int mes, int dia, int gestion){
        Mockito.when(res.existenPasajeros(destino, cantidad)).thenReturn(true);
        String current = ej2.reservarVuelo(destino,cantidad , mes,dia,gestion);
        Assertions.assertEquals("el dia: lunes 29 mayo 2023 existen 2 pasajes para La Paz", current, "Error en la prueba");
        Mockito.verify(res).existenPasajeros(destino,cantidad);
    }

}
