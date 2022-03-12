/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;


public class CalcularValorDeMoneda {
    public static void main(String[] args){
        double usd, Cantidad, Europa, ReinoUnido,Australia, canada, ResultadoEuro, ResultadoReino,ResultadoAutra, ResultadoCanada;
        
        Cantidad = 100.00;
        
        usd = 1;
        Europa = 0.70;
        ReinoUnido = 0.61  ; 
        Australia = 0.95 ;
        canada = 0.97 ;
        
        
        ResultadoEuro = Cantidad / Europa;
        
        System.out.println("Dolares en euros es: " + ResultadoEuro);
       
        
    }
}
