import clases.Cajero;

public class Aplicacion{
    public static void main(String args[]){
        int num1;
        num1= 7000;
        Cajero.retirarDinero (num1);
        int cantidadRetirada = Cajero.retirarDinero(num1);

    if(cantidadRetirada > 8000) {
        System.out.println("Estás tratando de retirar mucho dinero, el límite es $8000");
    } else {
        System.out.println("Has retirado $" + num1 + " exitosamente");
    }
        double total, paga;
        total = 30.5;
        paga = 30.5;
        Cajero.pagarFactura(total,paga);
        double cambio = Cajero.pagarFactura(total,paga);

    if(cambio < 0){
        System.out.println("Gracias por tu pago el día de hoy tu cambio es de: $" + cambio * (-1));
    }
    else if( cambio > 0){
        System.out.println("El día de hoy pagaste $" + paga +  ",aún te hacen falta $" + cambio);
    }
    else{
        System.out.println("Gracias por tu pago completo el día de hoy.");
    }
        int TotalACambiar;
        int DenominacionBillete;
        TotalACambiar = 2010;
        DenominacionBillete = 50;
        Cajero.cambiarBilletes(TotalACambiar,DenominacionBillete);
        int CambioEfectivo = Cajero.cambiarBilletes(TotalACambiar,DenominacionBillete);

        if(CambioEfectivo == 0){
            System.out.println("El número " + TotalACambiar + " puede ser cambiado por puros billetes de " + DenominacionBillete); 
        } else{
            System.out.println("El número " + TotalACambiar + " no puede ser cambiado por puros billetes de " + DenominacionBillete + " ya que sobrarían " + (TotalACambiar%DenominacionBillete)); 
        }
    }
}
