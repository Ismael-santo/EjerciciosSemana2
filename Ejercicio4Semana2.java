
package EjerciciosSemana2;

import java.util.Scanner;


public class Ejercicio4Semana2 {
        public static void main(String[] args) {
        
        double Salario = 300.00; 
        double Comisión = 50.00;
        double Renta = 0.10;
        double SalarioC;
        double SalarioR;
        double SalarioT;
        double comi;
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingresar el nombre de el vendedor"); 
        String nombre = leer.nextLine();
        
        System.out.println("Cuantas ventas se realizaron durante el  mes");
        double Venta = leer.nextDouble();
        
        comi= Venta * Comisión;
        
        SalarioC = Salario + comi;
        SalarioR = Salario * Renta;
        SalarioT = SalarioC - SalarioR;
        
        System.out.println("El salario total es de: $" + SalarioT);
        
        Renta = Salario * Renta;
        
        System.out.println("La cantidad a pagar de renta es de: $" + Renta);

    }
}
