
package EjerciciosSemana2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Ejercicio5Semana2 {
    public static void main(String[] args) {
        //Declarar  variables
        double SalarioB;
        double DescuentoT;
        double Renta = 0.10;
        double SalarioM;
        double Salario1;
        double F;
        double MinutoT;
        double Total;
        Scanner leer = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("#0.00");
        
        System.out.println("Escriba  su nombre");
        String nombre = leer.nextLine();
        
        System.out.println("Escriba su salario mensual");
        double salario = leer.nextDouble();
        
        System.out.println("Escriba los minutos tardes en el mes");
        double Minuto = leer.nextDouble();
        
        //Salario por minuto
        
        MinutoT = salario / 30;
        Salario1 = MinutoT / 8;
        SalarioM = Salario1 / 60;
        F = SalarioM * Minuto;
        
        //Formula
        
        SalarioB = salario - F;
        DescuentoT = SalarioB * Renta;
        Total = SalarioB - DescuentoT;
        
        System.out.println("Su nombre es: " + nombre);
        
        System.out.println("El descuento por llegadas tardes es de: " + formato.format(F));
        
        System.out.println("La retencion de renta es: $" + formato.format(DescuentoT));
        
        System.out.println("Su salario total es de: $" + formato.format(Total) ); 
    }  
}