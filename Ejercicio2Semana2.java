
package EjerciciosSemana2;

import java.util.Scanner;


public class Ejercicio2Semana2 {
     public static void main(String[] args) {
    double DAI;
    double depreciacion = 0.10;
    double Total1;
    double Total2;
    double Total3;
    double Mu2= 0.25;
    double Mu3 = 0.10;
    double Total;
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingresar valor del vehículo en USA");
    double ValorV = leer.nextDouble();
    
    System.out.println("Ingresar costo por flete");
    double flete = leer.nextDouble();
    
    System.out.println("Ingresar valor de seguro");
    double Seguro = leer.nextDouble();
    
    DAI= ValorV * depreciacion;
    Total1= ValorV - DAI;
    Total2 = Total1- flete;
    Total3 = Total2 -Seguro;
    Total = Total3 * Mu3;
    
    System.out.println("EL valor por Derecho Arancelario a la importacion de su vehicule es de:$ " + Total);
    depreciacion = ValorV * Mu3;
    
    System.out.println("El valor de Depreciacion es de: $" + depreciacion);
    }
    
}

