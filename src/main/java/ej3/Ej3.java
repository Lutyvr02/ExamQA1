package ej3;


public class Ej3 {

    private reservaVuelo res;

    public String getDay(int dia, int mes, int gestion){
        return "lunes";
    }

    private String convertirMes(int mes){
        switch (mes){
            case 1: return "enero";
            case 2: return "febrero";
            case 3: return "marzo";
            case 4: return "abril";
            case 5: return "mayo";
            case 6: return "junio";
            case 7: return "julio";
            case 8: return "agosto";
            case 9: return "septiembre";
            case 10: return "octubre";
            case 11: return "noviembre";
            case 12: return "diciembre";
            default: return "mes invaido";
        }
    }

    public String reservarVuelo(String destino, int cantidad,int mes, int dia, int gestion){
        if (res.existenPasajeros(destino, cantidad)){
            return "el dia: "+ getDay(dia,mes,gestion)+ " " + dia + " " + convertirMes(mes)+" "+ gestion +
                    " existen " + cantidad + " pasajes para "+ destino;
        } else {
            return "no existen suficientes pasajes para: " + destino;
        }

    }
}