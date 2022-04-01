
package EjerciciosSemana2;

import java.util.Scanner;


public class Ejercicio3Semana2 {
    public static void main(String[] args) {
        
        double salarioBase= 800.00;
        double Salario = 0.0; Scanner leer = new Scanner (System.in);

System.out.println("Introducir la cantidad de autos vendidos");
double n = leer.nextDouble();

System.out.println("Introducir el nombre de el vendedor");
String nombre = leer.next();
double com = ComisionAutosDos();

Salario =salarioBase + ComisionAutosVendidos(n) + com;

System.out.println("El salario del trabajador es: $" + Salario);
System.out.println("El nombre de el trabajador es: " + nombre);
    }
    public static double ComisionAutosVendidos(double Cantidad){
         double TotalComision = 170 * Cantidad;
         return TotalComision;
    }
    
    public static double ComisionAutosDos() {
        int xventas = 3;
        double Valorv1 = 5000;
        double Valorv2 = 7000;
        double Valorv3 = 15000;
        
        double Comision = (Valorv1 * 0.05) + (Valorv3 * 0.05);
        return Comision;
    }
    
}
