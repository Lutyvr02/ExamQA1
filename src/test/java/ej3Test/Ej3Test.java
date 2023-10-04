package ej3Test;

import ej3.Ej3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import ej3.reservaVuelo;

public class Ej3Test {
    private static Ej3 ej3;

    private static MockedStatic<reservaVuelo> res;

    @BeforeAll
    public static void setEj2(){
        res = Mockito.mockStatic(reservaVuelo.class);
        ej3 = new Ej3();
    }

    @ParameterizedTest
    @CsvSource({
            "La Paz, 2, 5, 29, 2023",
    })
    public void testej3(String destino, int cantidad,int mes, int dia, int gestion){
        res.when(() -> reservaVuelo.existenPasajeros(destino, cantidad)).thenReturn(true);
        String current = ej3.reservarVuelo(destino,cantidad , mes,dia,gestion);
        Assertions.assertEquals("el dia: lunes 29 mayo 2023 existen 2 pasajes para La Paz", current, "Error en la prueba");
        res.verify(() -> reservaVuelo.existenPasajeros(destino, cantidad));
    }

}
