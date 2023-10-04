package ej1;

public class Ej1 {
    private static final double SalarioBasico = 2000.0;

    public double verificarDescuento(double descuento) throws SalarioNoValidoException{
        if (descuento < 0){
            throw new SalarioNoValidoException("Salario No valido");

        }
        if (descuento <= SalarioBasico){
            return SalarioBasico;
        } else if (descuento <= 2*SalarioBasico) {
            return SalarioBasico - (SalarioBasico * 0.05);
        }else {
            return SalarioBasico - (SalarioBasico * 0.15);
        }
    }

    public class SalarioNoValidoException extends Exception {
        public SalarioNoValidoException(String message){
            super(message);
        }
    }
}
