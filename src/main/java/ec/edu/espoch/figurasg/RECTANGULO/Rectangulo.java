/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasg.RECTANGULO;

/**
 *
 * @author USER
 */
public class Rectangulo {
    public double base;
    public double altura;
    
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        
    }
    
    public double calcurArea(){
        return base * altura;
    }
    
    public double calcularPerimetro(){
        return 2* (base+altura);
        
    }
    
}