/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasg.CUADRADO;

/**
 *
 * @author USER
 */
public class Cuadrado {
        public double lado;
    
    
    public Cuadrado(double lado){
        this.lado = lado;
    
        
    }
    
    public double calcurAreaCuadrado(){
        return lado * lado;
    }
    
    public double calcularPerimetroCuadrado(){
        return 4*(lado);
        
    }
    
}
