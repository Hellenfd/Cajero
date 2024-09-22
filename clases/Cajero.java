package clases;

public class Cajero{
    public static int retirarDinero(int num1){
        return num1;
    }
    public static double pagarFactura(double total, double paga){
        return total - paga;
    }
    public static int cambiarBilletes(int TotalACambiar, int DenominacionBillete ){
        return TotalACambiar%DenominacionBillete;
    }
}

