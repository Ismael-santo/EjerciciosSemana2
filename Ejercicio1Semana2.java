
package EjerciciosSemana2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Ejercicio1Semana2 {
     public static void main(String[] args) {
    NumberFormat Formato = new DecimalFormat("#0.00");
        double Rebaja, Iva, PreT,Pre1, PreF, Total;
                
        Rebaja = 0.15;
        Iva = 0.13;
        PreT= 0.0;
        
   
        Scanner leer = new Scanner (System.in);
        
        
        double N = leer.nextDouble();
         System.out.println("Ingresar el precio de la computadora: ");
        
        
        PreT = N * Iva;
        Pre1 = N + PreT;
        PreF = Pre1* Rebaja;
        Total = Pre1 - PreF;
        
         System.out.println("El total del precio es: $" +Formato.format(Total));

       
    }
}
