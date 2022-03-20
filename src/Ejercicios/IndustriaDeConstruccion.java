/*
5-. Un trabajador de la industria de la construcción gana 
$10 diarios en su jornada normal de  trabajo.  En  ciertas
ocasionesel  empleado  tiene  que  trabajar  horas extras 
para cumplir con su trabajo. En el mes a acumulado 50 horas
extras que se la pagan al 10% del valor del pago diario. 
¿Cuánto ganara el trabajador al final de un mes de trabajo? 
*/
package Ejercicios;

import java.util.Scanner;


public class IndustriaDeConstruccion {
    public static void main(String[] args){
        Scanner Dias = new Scanner (System.in);
        
        
        double SueldoDiario = 10;
        double HorasExtras = 50;
        double ValorDePago = 0.10;
        double DiasTrabajados;
        
        System.out.println("Digite los dias Trabajados: ");
        DiasTrabajados = Dias.nextDouble();
        
        System.out.println("Salario Final del Trabajador es: $" + SueldoDiario * DiasTrabajados  * ValorDePago * HorasExtras);
    }
}
